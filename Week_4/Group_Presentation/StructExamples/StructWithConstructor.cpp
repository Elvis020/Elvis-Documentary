#include <iostream>
// Compiling with c99
// g++ -std=c++98 struct_two.cpp && ./a.out
using namespace std;

struct Car{
    int tyres;
    double speed;
    string name;

        // Constructor
    Car() 
        {
            tyres=0;
            speed=0.0;
            name="Honda";
        }
};

int main(){
     Car b1{};
     cout << "Tyres: "<<b1.tyres<< "j: "<<b1.speed << b1.name << endl;

     void printMe(){
        cout << b1.tyres << endl;
    }
}


  