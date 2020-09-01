#include <iostream>
#include <climits>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int noOfTestCases;
    cin >> noOfTestCases;
    while (noOfTestCases != 0) {
        int n = 0;
        int chefPawnPos = 0;
        cin >> n >> chefPawnPos;
        vector<int> nPositions;
        for (int i = 0; i < n; i++) {
            int nPosVal;
            cin >> nPosVal;
            nPositions.push_back(nPosVal);
        }
        if (chefPawnPos == 0 || nPositions.size() == 0) {
            return -1;
        }
        int min = INT_MAX;
        int minStep;
        for (int i = 0; i < nPositions.size(); i++) {
            int step = nPositions[i];
            if (chefPawnPos % step == 0) {
                int steps = chefPawnPos / step;
                if (min > steps) {
                    min = steps;
                    minStep = step;
                }
            }
        }
        if (min < INT_MAX) {
            cout << minStep << endl;
        } else {
            cout << "-1" << endl;
        }
        noOfTestCases--;
    }
    return 0;
}