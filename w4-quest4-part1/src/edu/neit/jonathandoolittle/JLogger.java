package edu.neit.jonathandoolittle;

import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * A thread-safe global logger that can push items
 * to multiple streams
 *
 * <pre>
 *  JLogger log = JLogger.getLogger();
 *  log.log("test");
 * </pre>
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 10, 2021
 *
 */
public class JLogger {

	// ******************************
	// Variables
	// ******************************
	
	private List<OutputStream> outStreams;
	private volatile static JLogger jLoggerSingleton;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new JLogger instance, with a default out stream of
	 * System.out
	 */
	private JLogger() {
		outStreams = new LinkedList<>();
		outStreams.add(System.out);
	}

	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Returns the global logger, or creates one with a default stream of
	 * System.out if one does not exist. Thread-safe.
	 * @return The global JLogger
	 */
	public static JLogger getLogger() {
		if(jLoggerSingleton == null) {
			synchronized(JLogger.class) {
				if(jLoggerSingleton == null) {
					jLoggerSingleton = new JLogger();
				}
			}
		}
		return jLoggerSingleton;
	}

	/**
	 * Adds a stream for the log to dump
	 * @param stream The stream to add
	 */
	public void addStream(OutputStream stream) {
		outStreams.add(stream);
	}
	
	/**
	 * Removes a stream from the logger, if it exists
	 * @param stream The stream to remove
	 * @return True, if the stream existed and was removed
	 */
	public boolean removeStream(OutputStream stream) {
		return outStreams.remove(stream);
	}
	
	/**
	 * Logs an item with the default tag of INFO
	 * @param item The item to log
	 * @see JLogType
	 */
	public void log(Object item) {
		log(item, JLogType.INFO);
	}
		
	/**
	 * Logs an item with the given type
	 * @param item The item to log
	 * @param type The type of message being logged
	 * @see JLogType
	 */
	public void log(Object item, JLogType type) {
		String time = String.format("[%1$tF %1$tT] ", java.time.LocalDateTime.now());
		String level = String.format("[%-8s] ",type.toString());
		pushToStreams(time + level + item.toString() + "\n");
	}
	
	// ******************************
	// Private methods
	// ******************************

	/**
	 * Pushes a string to all streams
	 * @param string The string to push
	 */
	private void pushToStreams(String string) {
		for(OutputStream stream : outStreams) {
			try {
				stream.write(string.getBytes());
			} catch (IOException e) {
				if(removeStream(stream)) {
					log(e, JLogType.ERROR);
					log("Removing Stream " + stream.getClass().getName() + " to prevent further errors");
				}
			}
		}
	}
	
}
