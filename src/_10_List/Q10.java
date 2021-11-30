package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q10 {
	/*
	 * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 } type a program to create a
	 * new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
	 */
	public static void main(String[] args) {

		int[] arr = { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
		
		List <String> list1= new ArrayList<>();
		List <String> bos= new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			list1.add(String.valueOf(arr[i]));
		}
		
		
		bos.add(list1.get(0));
		bos.add(list1.get(1)+"+"+list1.get(2));
		bos.add(list1.get(1)+"+"+list1.get(2)+"+"+list1.get(3));
		
		//System.out.println(n + "+" + (n+1));
	
		System.out.println(bos);
	}
}
