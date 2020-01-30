package Insertion_sort;
import java.util.Scanner;
public class Insertion_Sort {
	void sort(int arr[]) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j-=1;
			}arr[j+1]=key;
			
		}for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insertion_Sort s=new Insertion_Sort();
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of elements in array:");
		int n=sc.nextInt();
		int arr[] =new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter element:");
			arr[i]=sc.nextInt();
		}
		
		s.sort(arr);
		

	}

}
