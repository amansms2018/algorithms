package com.example.algorithms.Array;// JAVA Code to find length of
// Longest increasing subarray 
import java.util.*; 

class LongestSubArray {
	
	// function to find the length of longest 
	// increasing contiguous subarray 
	public static String lenOfLongIncSubArr(int arr[])
	{ 
		// 'max' to store the length of longest 
		// increasing subarray 
		// 'len' to store the lengths of longest 
		// increasing subarray at diiferent 
		// instants of time 
		int max = 1, len = 1; 
		int s=0;
		int e=0;
		int max2=1;
		int currentInd= 0;
		// traverse the array from the 2nd element 
		int i =0;

//		int arr[] =  {2,11,3,5,13,7,19,17,23};
		for ( i=1; i<arr.length; i++) {
			// if current element if greater than  	// previous element, then this element
			// helps in building up the previous  / increasing subarray encountered
			// so far 
			if (arr[i] > arr[i - 1]) {
			}
			else  {
				if ((i -currentInd) > max2) {
				max2 = (i-currentInd) ;
				s = currentInd;
				e = i-1;
				currentInd = i;
			}
				else {
					currentInd= i;
				}
		}

			System.out.println( " i " + i + " A[i]  "+ arr[i] + " " + "s "  + s + " e " + e  +"  currentInd " +currentInd);
		} 
		
		// comparing the length of the last 
//		// increasing subarray with 'max'
//		if (max < len)
//			max = len;
 if(arr[arr.length-1]==arr[arr.length-2]){
	 if( i-currentInd> max2){
		 max2  = (i-currentInd);
		 s=currentInd;
		 e= i;
	 }

 }


		
		// required maximum length 
		return  "s "  + s + "  " + e;
	} 
	
	/* Driver program to test above function */
	public static void main(String[] args) 
	{
		int arr[] =  {5, 6, 4, 5, 7, 9, 1, 2};
//				{2,11,3,5,13,7,19,17,23};
				//{5, 6, 3, 5, 7, 8, 9, 1, 2};
			int n = arr.length; 
			System.out.println("Length = " + lenOfLongIncSubArr(arr));
		
		} 
	} 
	
// This code is contributed by Arnav Kr. Mandal. 
