package array_except_self;
import java.util.ArrayList;

public class FindProduct {
	public void findProduct(int[] nums) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int prod = 1;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(j == i) {
					continue;
				} else {
					prod = prod * nums[j];
				}
			}
			arr.add(prod);
			prod = 1;
		}
		System.out.println(arr);
	}
	
	public static void main(String[] args) {
		FindProduct product = new FindProduct();
		int[] nums = {1, 2, 3, 4, 5};
		
		product.findProduct(nums);
	}
}
