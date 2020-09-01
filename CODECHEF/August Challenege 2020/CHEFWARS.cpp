#include <iostream>
using namespace std;

int main() {
	int noOfTestCases;
	cin >> noOfTestCases;
	while (noOfTestCases != 0) {
	    int darthHealth, chefAttackPower;
	    cin >> darthHealth >> chefAttackPower;
	    while (darthHealth > 0 && chefAttackPower > 0) {
	        darthHealth -= chefAttackPower;
		    chefAttackPower /= 2;
	    }
	    if (darthHealth > 0) {
	        cout << "0" << endl;
	    } else {
	        cout << "1" << endl;
	    }
	    noOfTestCases--;
	}
	return 0;
}
