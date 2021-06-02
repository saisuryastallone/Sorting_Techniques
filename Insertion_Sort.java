import java.util.Scanner;

public class Insertion_Sort {

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
		
		//Insertion Sort Logic
		for(int i=0;i<size;i++) {
			for(int j=0;j<=i+1 && j<size;j++) {
				if(elements[i]<elements[j]) {
					
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
		
		//Displaying the elements in ASC Order after insertion sorting
		System.out.println("Elements sorted successfully : ");
		for(int i=0;i<size;i++) {
			
			System.out.print(elements[i]+"\t");
		}
		

	}
	

}
