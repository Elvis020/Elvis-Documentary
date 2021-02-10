#include <iostream>

// Using designated initializers
// Somethings were legal in C99 but not legal in C++11

using namespace std;

struct Person
{
    int height;
    int weight;
    int age;
};

int main()
{
    Person p {.height=20,.weight=3,.age = 18};
    // Person f {.weight=3,.height=21,.age = 18}; //Gives an error cuz it needs to be in order
    cout << p.weight << endl;
    cout << p.height << endl;
    cout << p.age << endl;
}