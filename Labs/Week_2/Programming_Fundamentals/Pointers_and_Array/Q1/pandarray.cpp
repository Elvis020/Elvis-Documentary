#include <iostream>
#include <string>
#include <cstring>

using std::cin;
using std::cout;
using std::endl;



int main(){
    std::string Word;
    cout << "Please enter a string" << endl;
    getline(cin, Word);
    const char *newWord= Word.c_str();
    // The c.str returns a character pointer

    for(int i=0; i < strlen(newWord); ++i){
        cout << newWord[i] << endl;
    }
}