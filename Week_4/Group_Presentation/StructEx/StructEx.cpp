#include <iostream>


using namespace std;


// Creating Structs
struct Recording{
    string title;
    string artist = "Medikal";
    float cost;
    int quantity;

};


int main(){
    Recording song1,song2;
    song1.title = "Lady Gaga";
    song1.artist = "sPaCeY";
    song1.cost = 3.50;
    song2 = song1;

    cout << song2.title << " is the title of my fav song." << endl;
}