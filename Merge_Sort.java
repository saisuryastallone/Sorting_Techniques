import java.util.Scanner;

public class Merge_Sort {

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
		
		mergeSort(elements, 0,elements.length-1 );
		
		//Displaying the elements in ASC Order after insertion sorting
		System.out.println("Elements sorted successfully : ");
		for(int i=0;i<size;i++) {
			
			System.out.print(elements[i]+"\t");
		}
		

	}
	
	//Merge Sort Logic
	public static void mergeSort(int[] arr, int left, int right) {
		if (left<right) {
			int mid = (left+right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			mergeArrays(arr, left, mid, right);

		}
		
		
	}
	
	//Merge Sub-arrays Logic
	public static void mergeArrays(int[] arr, int left, int mid, int right) {
		int[] leftArray = new int[mid-left+1];
		int[] rightArray = new int[right - mid];
		
		
		for (int i=0;i<leftArray.length; i++) {
			leftArray[i] = arr[left+i];
		}
		
		for(int j=0;j<rightArray.length;j++) {
			rightArray[j] = arr[mid+1+j];
		}
		
		int i=0;
		int j=0;		;
		int k = left;
		
		while(i<leftArray.length && j<rightArray.length) {
			if(leftArray[i]>rightArray[j]) {
				arr[k] = rightArray[j];
				j++;
			}
			else {
				arr[k] = leftArray[i];
				i++;
			}
			k++;

		}
		
		while(i<leftArray.length) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		
		while(j<rightArray.length) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
		
		
		
	
		
		
		
		
	}			
		
}
	




