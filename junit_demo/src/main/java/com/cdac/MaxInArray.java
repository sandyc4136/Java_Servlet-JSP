package com.cdac;

import java.util.Scanner;

public class MaxInArray {

//	public void main(String args[]) {
////		Scanner sc= new Scanner(System.in);
////		int arr[] = new int[4];
////		for(int i=0;i<5;i++)
////			arr[i]=sc.nextInt();
//		
//		System.out.println("Maximum value in the array is  "+ findMax(arr));
//	}
	public int findMax(int arr[]) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
}
