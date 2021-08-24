class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] num1Parts = num1.split("\\+");
        String[] num2Parts = num2.split("\\+");

        int x = Integer.parseInt(num1Parts[0]);
        int y = Integer.parseInt(num1Parts[1].replace("i",""));
        int c = Integer.parseInt(num2Parts[0]);
        int d = Integer.parseInt(num2Parts[1].replace("i",""));

        String firstAnswer = Integer.toString(x * c + y * d * -1);
        String secondAnswer = Integer.toString(x * d + y * c) + "i";

        return firstAnswer + "+" + secondAnswer;
    }
}