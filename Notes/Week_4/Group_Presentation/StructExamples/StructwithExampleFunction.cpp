// Passing struct as arguments

#include <iostream>

using namespace std;



struct dist{
    int feet;
    int inches;
}length_1={2,3},length_2={4,5};


void prtlength(dist  length_1,dist  length_2){
    cout<< "***Inches***\n";
    cout << length_1.inches <<endl;
    cout << length_2.inches <<endl;
    cout<< "***Feet***\n";
    cout << length_1.feet <<endl;
    cout << length_2.feet <<endl;
};

int main(){
    prtlength(length_1,length_2);
}