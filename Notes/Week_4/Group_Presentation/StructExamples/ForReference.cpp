#include <iostream>

using namespace std;


// Without intializers in Struct a
struct A{
    int i;
    double j;
};



// Without intializers in Struct b

struct B{
    int i;
    double j;
    B() 
        {
            i=0;
            j=0.0;
        }
};


// struct C{
//     double price;
//     string name;
// }c={12.1,"Elvis"};

struct C{
    double price;
    string name;
}c,v;


int main(){
    // A a = {};
    // A a1 = {1,2.8};
    
    // C c = {};
    // C c;

//    B b1 = {1,9.8,"Elvis"};
//    price = {21.1};
//    name = {"Elvis"};


//    B b2,b3 = {};
//    B b1 = {1,9.8};
   B b1;
    // cout << "Without  initialization" << endl;
    // cout << "i: " << a.i << " j: " << a.j << endl;
    // cout << "i1: " << a1.i << " j1: " << a1.j << endl;

    cout << "With initialization" << endl;
    cout << "i1: " << b1.i << " j1: " << b1.j << endl;
    // cout << "price: " << c.price << " name: " << c.name << endl;
    // cout << "price: " << c.price << " name: " << v.name << endl;
    // cout << "price: " << c.price << " name: " << c.name << endl;


    // To switch between g++ compilers:
    // g++ -std=c++14 struct_two.cpp && ./a.out
}