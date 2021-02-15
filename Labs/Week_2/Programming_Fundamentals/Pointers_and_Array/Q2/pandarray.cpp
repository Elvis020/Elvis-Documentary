#include <iostream>
#include <string>
#include <cstring>
#include "./myString.h"

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


// For string length
    // cout <<  "The length of the string: " << my::strlen(newWord)<<endl;


// For string comparision
    // const char newString[] = "hello";
    // my::strcmp(newWord,newString) ? cout <<"not equal\n" : cout << " equal\n";

    // For string concatenation(paused)
    const char *concat = my::strcat("hello", newWord);
    cout << concat << endl;
    delete concat;


    // For str copy
    char newString[] = "moi";
    std::strcpy(newString, newWord);
    cout <<"New string: "<< newString << endl;
    delete newString;
}