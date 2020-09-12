#include <bits/stdc++.h>

using namespace std;

long long int position(long long int sum) {
    long double ans = sqrtl(1ul+4*(sum));
    ans = ans - 1.0;
    ans = ans / 2.0;
    long long int fs = ans;
    return fs;
}

int main() {
    long long int numOfTestCases;
    cin >> numOfTestCases;
    while (numOfTestCases--) {
        long long int num;
        cin >> num;
        if (num == 0 || num == 1 || num == 2) {
            cout << 0 << endl;
            continue;
        }
        long long int total = (num * (num + 1)) / 2;
        if (total % 2 != 0) {
            cout << 0 << endl;
            continue;
        }
        long long int index = position(total);
        long long int ss = (index * (index + 1)) / 2;
        if (ss == total / 2) {
            long long int answer = (index * (index - 1ul))/2l + ((num - index)*(num - index - 1ul))/2l+(num-index);
            cout << answer << endl;
        } else {
            cout << num - index << endl;
        }
    }
    return 0;
}