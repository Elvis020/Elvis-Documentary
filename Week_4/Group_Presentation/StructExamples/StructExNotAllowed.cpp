#include <iostream>

using namespace std;


// Without intializers in Struct b
struct Car{
    int tyres = 0;
    double speed = 0.0;
    string name="Honda";
};



//List initializer:
    // Provides a list of values to the member variables in the order that they are provided.

int main(){
    Car b2 {}; 
    
    cout << "Tyres: " << b2.tyres << " Speed: " << b2.speed <<  " " << b2.name << endl;
}