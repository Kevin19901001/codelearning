package chapter01;

public class Case08ArrayIntroduction {

	public static void main(String[] args) {
		
		// initialize array:
		int[] arr1 = {1, 3, 5, 7, 2, 8, 6, 4, 2};
		System.out.println(arr1);
		
		int[] arr2;
		arr2 = new int[]{10, 23, 30, -10, 96};
		System.out.println(arr2);
		
		// length of array:
		int[] arr3 = new int[] {3, 6, 8, 9};
		int length = arr3.length;
		System.out.println("数组的长度为：" + length);
		
		// access array through index:
		int[] arr4 = new int[] {4, 5, 6, 8};
		int temp = arr4[2];
		arr4[2] = arr4[3];
		arr4[3] = temp;
		System.out.println(arr4);
		
		// iterate elements from array:
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		
		int[] arr5 = new int[] {10, 20, 30, 40, 50};
		for (int i = (arr5.length-1); i >= 0; i--) {
			System.out.println(arr5[i]);
		}
		
		// copy array:System.arraycopy(src, srcPos, dest, destPos, length);
		
		// sort array:
	}

}
