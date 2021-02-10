#include <iostream>
using namespace std;

// You can return struct from a function.

struct Person {
    int age;
    float salary;
};


// @ functions are used to illustrate this point
Person getData(Person f){
    f.age = 21;
    f.salary = 90.3;

    return f;
};

int main(){
    Person p;

    p = getData(p); 
    cout << p.age << endl; 
    cout << p.salary << endl; 

}
