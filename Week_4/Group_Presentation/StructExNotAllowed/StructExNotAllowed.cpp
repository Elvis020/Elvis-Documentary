#include <iostream>

using namespace std;


// Without intializers in Struct b
struct Car{
    int i = 0;
    double j = 0.0;
    string name="Honda";
};

int main(){
    Car b2,b3 = {}; //List initializer:Provides a list of values to the member variables in the order that they are provided.

    cout << "i: " << b2.i << " j: " << b3.j << b2.name << endl;
}