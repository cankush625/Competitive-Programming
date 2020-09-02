class Solution {
public:
    bool validMountainArray(vector<int>& A) {
        int isAscending = false;
        int isDescending = false;
        if (A.size() == 0) {
            return false;
        }
        for (int i = 0; i < A.size() - 1; i++) {
            if (isDescending == false && A[i] < A[i + 1]) {
                isAscending = true;
            } else if (isAscending == true && A[i] > A[i + 1]) {
                isDescending = true;
            } else {
                return false;
            }
        }
        return isAscending && isDescending;
    }
};