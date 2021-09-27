package edu.neit.jonathandoolittle;

public class Main {

	public static void main(String[] args) {
		RoundHole hole = new RoundHole(8);
		SquarePeg peg1 = new SquarePeg(10);
		RoundPeg  peg2 = new RoundPeg(22);
		SquarePegAdapter peg3 = new SquarePegAdapter(peg1);
		
		pegTest(hole, peg2);
		pegTest(hole, peg3);
		
		
	}
	
	public static void pegTest(RoundHole h, Radius r) {
		if(h.pegFits(r)) {
			System.out.println("The peg fit! (" + r.getRadius() + " in a " + h.radius + " hole)");
		} else {
			System.out.println("The peg didn't fit! (" + r.getRadius() + " in a " + h.radius + " hole)");
		}
	}
	
}
