import java.util.Scanner;

public class Heap_Sort {


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
			
			sort(elements);
			
			//Displaying the elements in DESC Order after heap sorting
			System.out.println("Elements sorted successfully : ");
			for(int i=0;i<size;i++) {
				
				System.out.print(elements[i]+"\t");
			}
			

		}
		
		//Heapify Logic
		public static void heapify(int[] arr, int n, int i) {
			
			int root = i;
			int leftChild = 2*i+1;
			int rightChild = 2*i+2;
			int swap =0;
			
			if(leftChild<n && arr[leftChild]>arr[root]) {
				root = leftChild;
				
			}
			
			if(rightChild<n && arr[rightChild]>arr[root]) {
				root = rightChild;
				
				
			}
			
			if(root!=i) {
				swap = arr[root];
				arr[root] = arr[i];
				arr[i] = swap;
				heapify(arr,n,root);
			}
			
			
			
			
		}
		
		
		public static void sort(int arr[]) {
		      int n = arr.length;
		  
		      // Build max heap
		      for (int i = n / 2 - 1; i >= 0; i--) {
		        heapify(arr, n, i);
		      }
		  
		      // Heap sort
		      for (int i = n - 1; i >= 0; i--) {
		        int temp = arr[0];
		        arr[0] = arr[i];
		        arr[i] = temp;
		  
		        // Heapify root element
		        heapify(arr, i, 0);
		      }
		}


}			

