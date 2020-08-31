#include <iostream>

using namespace std;

int main() {
	int noOfTestCases;
    cin >> noOfTestCases;
    while (noOfTestCases != 0) {
        int powerOfChef, powerOfRick;
        cin >> powerOfChef >> powerOfRick;
        int noOfDigitsForChef;
        if (powerOfChef % 9 == 0) {
            noOfDigitsForChef = powerOfChef / 9;
        } else {
            noOfDigitsForChef = (powerOfChef / 9) + 1;
        }
        
        noOfTestCases--;
    }
	return 0;
}