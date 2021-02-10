// Passing struct as arguments

#include <iostream>

using namespace std;



// Method 2
struct dist{
    int feet;
    int inches;
}len1={2,3},len2={4,5};


// Method 1
// struct dist{
//     int feet;
//     int inches;
// };


void prtsum(dist &len1,dist &len2){
    cout << len1.inches <<endl;
    cout << len2.inches <<endl;
    cout << len1.feet <<endl;
    cout << len2.feet <<endl;
};
int main(){

    // Method 1
    // dist len1,len2;
    // len1.feet = 20;
    // len1.inches = 9;
    // len2.feet = 2;
    // len2.inches = 90;
    prtsum(len1,len2);
}