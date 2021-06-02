import java.util.Scanner;

public class Selection_Sort {

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
		
		int temp = 0;
		
		//Selection Sort Logic
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(elements[i]>elements[j]) {
					
				temp = elements[i];
				elements[i] = elements[j];
				elements[j] = temp;
				}
			}
			System.out.print("After pass "+i+" : ");
			for(int k : elements) {
				System.out.print(k+"\t");
			}
			System.out.println();
			
		}
		
		//Displaying the elements in ASC Order after selection sorting
		System.out.println("Elements sorted successfully after Selection Sorting as - ");
		for(int i=0;i<size;i++) {
			System.out.print(elements[i]+"\t");
		}
		
	}

}
