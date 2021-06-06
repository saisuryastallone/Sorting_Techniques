import java.util.Random;
import java.util.Scanner;

public class Quick_Sort {

	public static void main(String[] args) {
		
		int[] elements;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		elements = new int[size];
		System.out.println("Enter the elements into the array: ");
		for(int i=0;i<size;i++) {
			elements[i] = sc.nextInt();
		}
		
		quickSort(elements, 0,elements.length-1 );
		
		//Displaying the elements in ASC Order after insertion sorting
		System.out.println("Elements sorted successfully : ");
		for(int i=0;i<size;i++) {
			
			System.out.print(elements[i]+"\t");
		}
		

	}
	
	//Quick Sort Logic
	public static void quickSort(int[] arr, int low, int high) {
		if (low<high) {
			int pivot = partition(arr, low, high);
			
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
			

		}
		
		
	}
	
	
	//Key Logic for partition
	public static int partition(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		int i = low;
		int temp =0;
		
		for( int j=low; j<high;j++ ) {
			if(arr[j]<pivot) {
				
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] =temp;
				i++;
			}
			
		}
		
		temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		
		
		return i;
		
		
	}


		
	}			

