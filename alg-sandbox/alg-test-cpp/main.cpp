#include <iostream>
#include <chrono>
#define ARRAY_WIDTH 10000
#define ARRAY_HEIGHT 1000

/**
 * Test using mod
 */
static void sumUsingMod(float ** array, int w, int l) {
    float total = 0.0f;
    for(int i = 0; i < l*w; i++) {
        total += array[i%w][i/w];
    }
}

/**
 * Test using default double for
 */
static void sumUsingDoubleFor(float ** array, int w, int l) {
    float total = 0.0f;
    for(int y = 0; y < l; y++) {
        for(int x = 0; x < w; x++) {
            total += array[x][y];
        }
    }
}

/**
 * Test w/o using division using while
 */
static void sumUsingNoDivisionWithWhile(float ** array, int w, int l) {

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
}

int main()
{
    float ** array;

    array = new float *[ARRAY_HEIGHT];
    for(int i = 0; i <ARRAY_HEIGHT; i++)
        array[i] = new float[ARRAY_WIDTH];

    for(int y = 0; y <ARRAY_HEIGHT; y++) {
        for(int x = 0; x < ARRAY_WIDTH; x++) {
            array[x][y] = (float) (y*ARRAY_WIDTH) + x;
        }
    }

    using std::chrono::high_resolution_clock;
    using std::chrono::duration_cast;
    using std::chrono::duration;
    using std::chrono::milliseconds;

    auto t1 = high_resolution_clock::now();
    sumUsingMod(array, ARRAY_WIDTH, ARRAY_HEIGHT);
    auto t2 = high_resolution_clock::now();

    duration<double, std::milli> ms_double = t2 - t1;

    std::cout << "MOD: " << ms_double.count() << "ms\n";

    //----

    t1 = high_resolution_clock::now();
    sumUsingDoubleFor(array, ARRAY_WIDTH, ARRAY_HEIGHT);
    t2 = high_resolution_clock::now();

    ms_double = t2 - t1;

    std::cout << "DOUBLE FOR: " <<  ms_double.count() << "ms\n";

    //----

    t1 = high_resolution_clock::now();
    sumUsingNoDivisionWithWhile(array, ARRAY_WIDTH, ARRAY_HEIGHT);
    t2 = high_resolution_clock::now();

    ms_double = t2 - t1;

    std::cout << "WHILE: " <<  ms_double.count() << "ms\n";

    return 0;
}


