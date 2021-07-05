// Firstly add the possible z to the array by suntracting 26 from k and count how many characters added. Then
// if the value of k becomes less than 26 then add that chacter to the array at next index.
// Now, check if the number of character added to the array are equal to n. If the characters are less than n
// then go to the last added character in the array. If the last added character is greater than 'a' then subtract 1 from this
// character and add 'a' to the next index in the array Else if the last added character is equal to 'a' then go to the previous
// character in the array till previously added character is greate than a. And the above step till number of characters in the
// array are equal to n.
class Solution {
    public String getSmallestString(int n, int k) {
        char[] array = new char[n];
        int i = 0;
        int temp = 0;
        while (k >= 26) {
            k -= 26;
            array[i] = (char) 26+96;
            temp = i;
            i++;
        }
        if (k < 26 && k > 0) {
            int num = k + 96;
            array[i] = (char) num;
            temp = i;
            i++;
        }
        
        while(i < n && temp >= 0) {
            System.out.println((int) array[temp]);
            if (array[temp] == 97) {
                temp--;
            }
            if (array[temp] > 97) {
                int num = (int) array[temp];
                num--;
                array[temp] = (char) num;
                array[i] = 'a';
                i++;
            }
        }
        
        Arrays.sort(array);
        
        return new String(array);
    }
}