package Insertion_sort;

import java.util.Scanner;

public class Insertion_Sort_Recurtion {
	static void insertionSortRecursive(int arr[], int n) 
    { 
        
        if (n <= 1) 
            return; 
       
        
        insertionSortRecursive( arr, n-1 ); 
       
         
        int last = arr[n-1]; 
        int j = n-2; 
       
        
        while (j >= 0 && arr[j] > last) 
        { 
            arr[j+1] = arr[j]; 
            j--; 
        } 
        arr[j+1] = last; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insertion_Sort_Recurtion s=new Insertion_Sort_Recurtion();
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of elements in array:");
		int n=sc.nextInt();
		int arr[] =new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter element:");
			arr[i]=sc.nextInt();
		}
		
		s.insertionSortRecursive(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
