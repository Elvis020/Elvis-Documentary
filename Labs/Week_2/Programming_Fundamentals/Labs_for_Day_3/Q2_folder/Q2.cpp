#include <iostream>
#include <typeinfo>
#include "funchead.h";

using namespace std;

// struct nummy{int nummy1; int nummy2;};

// nummy input() {
//     int nummy1=0;
//     int nummy2=0;
//     cout << "Please enter the first number: " << endl;
//     cin>>nummy1;
//     cout << "Please enter the second number: " << endl;
//     cin>>nummy2;
//     nummy numb;
//     return numb.nummy1;
//     return numb.nummy2;
// }

// output function
void output(int a){
    cout << typeid(a).name()  << endl;
}
void output(char a){
    cout << typeid(a).name()  << endl;
}
void output(float a){
    cout << typeid(a).name()  << endl;
}
void output(char a[]){
    cout << typeid(a).name()  << endl;
}
void output(char a[], float b){
    cout << typeid(a).name()  << " and " << typeid(b).name() << endl;
}
int main(){
    output(3);
    output('a');
    output("Elvis Opoku");
    output(3.14f);
    output("Moi is coming", 3.2f);
    cout << "--------------- Factorial -----------" << endl;
    cout << factorial(4) << endl;
}



int factorial(int a){
    if (a > 1){
        return a*factorial(a-1);
    }
    return 1;
}

