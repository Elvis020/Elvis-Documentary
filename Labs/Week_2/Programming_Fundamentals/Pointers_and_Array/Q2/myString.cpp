#include <iostream>
#include "./myString.h"


using std::cin;
using std::cout;
using std::endl;

// definitions for my string methods
namespace my 
{
    // strcmp
    int strcmp(const char *l, const char *r){
        int i = 0;
        while(l[i] != '\0'){
            if(l[i] == r[i]){
                i++;
            }else{
                return 1;
            }
        }
        return 0;
    }
    // strlength
    int strlen(const char *s){
        int count = 0;
        int i = 0;

        while (s[i] != '\0'){

            count ++;
            i++;
            // cout << s[i] << endl;
        }
        return count;

    }
    // strcat
    char *strcat(char *l, const char *r){
        // int n = my::strlen(l) + my::strlen(r);
        // char * newWord[n];

        // OR
        int i = 0;
        char *newContainer = new char[(sizeof(l) + sizeof(r))];
        int endIndex = sizeof(l);
        for(;i < sizeof(newContainer); i++){
            newContainer[i] = l[i];
            newContainer[i + endIndex]  = r[i];
        }
        return newContainer;
    }
    // strcpy
    char *strcpy(char *l, const char *r){
        // Scenario 1: If r is shorter than l
        // Scenario 2: If l is shorter than r
        if(sizeof(l) > sizeof(r)){
            int i = 0;
            while(r[i] != '\0'){
                l[i] = r[i];
                i++;
            }
        }else{
            l = new char[sizeof(r)];
            int i = 0;
            while(r[i] != '\0'){
                l[i] = r[i];
                i++;
            }
        }
        return l;

    }
    // toupper
    // char *toupper(char *s){
    //     return 0;

    // }

}