#include <iostream>
#include <string>

struct Vector3
{
    float x, y, z;

    Vector3() : x(10), y(11), z(12){};
};

int main()
{
    // Memory allocation on a stack
    int value{5};
    int array[5];
    // Allocating the struct on the stack
    Vector3 vector;
    // Creating an array on a stack
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;
    array[3] = 4;
    array[4] = 5;

    // Memory allocation on a heap
    int *hvalue = new int;
    *hvalue = 5;

    // Allocating it on a heap
    Vector3 *hvector = new Vector3;

    // Creating an array on the heap.
    // Creating an array on a stack
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;
    array[3] = 4;
    array[4] = 5;

    std::cin.get();
}