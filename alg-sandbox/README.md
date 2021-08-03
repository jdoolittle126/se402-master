## Algorithm Sandbox

This contains two projects, one in Java and the other in C++. Here I tested the speed of various methods of traversing a 2D array, based on Dr. Saban's challenge. Double for loops are always O(n^2), so the idea of this was to look at how much faster using a single for, O(n), actually were.The code is lightly commented to explain some of the attempted methods. All of the methods use finding the sum of a float array as the 'weight' of the function. Based on what was found, this is the fastest way to traverse the array. In both languages, but particularly Java, it seems integer division is a heavy operation, so tracking row and col values proved to be more efficient.

    float total = 0.0f;
    int r = 0;
    int c = 0;
    while(true) {
        total += array[c][r];
        if(++r == w) {
            if(++c == l)
                break;
            r = 0;
        }
    }
    
    