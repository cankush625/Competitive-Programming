#include <iostream>
#include <set>

using namespace std;

int main() {
    int numOfTestCases;
    cin >> numOfTestCases;
    while (numOfTestCases != 0) {
        int numOfSticks;
        cin >> numOfSticks;
        set<int> stickHeights;
        for (int i = 0; i < numOfSticks; i++) {
            int temp = 0;
            cin >> temp;
            stickHeights.insert(temp);
        }
        int n = stickHeights.size();
        auto itr1 = stickHeights.find(0);
        if (itr1 != stickHeights.end()) {
            n -= 1;
        }
        cout << n << endl;
        numOfTestCases--;
    }
}