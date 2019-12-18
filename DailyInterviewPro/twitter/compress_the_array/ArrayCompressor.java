package twitter.compress_the_array;

public class ArrayCompressor {
	public static void main(String[] args) {
		char[] array = {'a', 'a', 'b', 'c', 'c', 'c'};
		
		CompressTheArray arrCompress = new CompressTheArray();
		
		arrCompress.compressTheArray(array);
	}
}
