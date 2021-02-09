#include <iostream>

using namespace std;



void operation(float num1, float num2){
    char op;
    cout << "Please input the operator: ";
    cin>>op;

    switch(op){
        case '+':
            cout << "Adding "<<num1<<" and "<<num2<< " yields " <<num1+num2 << endl;
            break;
        case '-':
            cout << "Subtracting "<<num2<<" from "<<num1<< " yields " <<num1-num2 << endl;
            break;
        case '*':
            cout << "Multiplying "<<num1<<" and "<<num2<< " yields " <<num1*num2 << endl;
            break;
        case '/':
            if(num2 == 0){
                cout<<"Cannot divide by 0";
                break;
            }
            else{
                cout << "Dividing "<<num1<<" by "<<num2<< " yields " <<num1/num2 << endl;
                break;
            }
    }
}


// Write the getInput function
void getInput(){
    float num1,num2;
    cout << "Please enter two operands: \n";
    cin >> num1>>num2;


    operation(num1,num2);
}


int main(){
    getInput();
}