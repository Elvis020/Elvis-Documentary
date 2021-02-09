#include <iostream>
using namespace std;
int main(){
	int i {5};
	int *p {&i};
	*p = 10;
	int **j {&p};
	int ***q {&j};
	int ****r {&q};
	cout << *p << " " << i <<endl;
	cout << "J: " << **j <<endl;
	cout << "Q: " << ***q <<endl;
	cout << "R: " << ****r << endl;
}
