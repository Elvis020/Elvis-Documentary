#include <iostream>

using namespace std;

int main() {
    int luckyNum[4];
    cout << &luckyNum[0] << endl;
    cout << "Luckynum address of 1st index: " << luckyNum << endl;
    cout <<"Luckynum 1st index: " <<  luckyNum[0] << endl;
    cout <<"Luckynum 2nd index: " <<  luckyNum[2] << endl;
    cout <<"2nd way of writing Luckynum 2nd index: " << *(luckyNum + 2) << endl;
    cout <<"Writing Luckynum 2nd index's address: " << luckyNum + 2 << endl;



// For loop with array using subscript
//     for (int i =0; i<=4; i++){
//         cout << "Number: " << endl;
//         cin >> luckyNum[i];
//     }
// // For loop with array using pointers
//     for (int i =0; i<=5; i++){
//             cout << *(luckyNum + i) << " ";
//         }
}