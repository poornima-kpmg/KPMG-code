package com.programming.class1;

public class MinVal {

	public static void main(String[] args) {
		
		int[] intArr = {10,9,84,5,6};
		minValue(intArr);
		
	}

	static void minVal(int[], intArr) {
		int firstVal = intArr[0];
		
		for(int i=0;i<intArr.length;i++) {
			if(firstVal>intArr[i]) {
				firstVal = intArr[i];
	}

}
}