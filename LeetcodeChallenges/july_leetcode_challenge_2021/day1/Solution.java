class Solution {
    private ArrayList<String> generateGrayCode(int n) {
        if (n == 1) {
            ArrayList<String> res = new ArrayList<String>();
            res.add("0");
            res.add("1");
            return res;
        }
        ArrayList res = generateGrayCode(n-1);
        ArrayList<String> finalResult = new ArrayList<String>();
        
        for (int i = 0; i < res.size(); i++) {
            finalResult.add("0" + res.get(i));
        }
        for (int i = res.size()-1; i >= 0; i--) {
            finalResult.add("1" + res.get(i));
        }
        return finalResult;
    }
    
    public List<Integer> grayCode(int n) {
        ArrayList<String> grayCode = generateGrayCode(n);
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < grayCode.size(); i++) {
            result.add(Integer.parseInt(grayCode.get(i), 2));
        }
        return result;
    }
}