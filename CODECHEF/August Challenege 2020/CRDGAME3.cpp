#include <iostream>

using namespace std;

int main() {
	int noOfTestCases;
    cin >> noOfTestCases;
    while (noOfTestCases != 0) {
        int powerOfChef, powerOfRick;
        cin >> powerOfChef >> powerOfRick;
        int noOfDigitsForChef;
        int noOfDigitsForRick;
        if (powerOfChef % 9 == 0) {
            noOfDigitsForChef = powerOfChef / 9;
        } else {
            noOfDigitsForChef = (powerOfChef / 9) + 1;
        }
        if (powerOfRick % 9 == 0) {
            noOfDigitsForRick = powerOfRick / 9;
        } else {
            noOfDigitsForRick = (powerOfRick / 9) + 1;
        }
        if (noOfDigitsForChef == noOfDigitsForRick || noOfDigitsForRick < noOfDigitsForChef) {
            cout << "1 " << noOfDigitsForRick << endl;
        } else {
            cout << "0 " << noOfDigitsForChef << endl;
        }
        noOfTestCases--;
    }
	return 0;
}