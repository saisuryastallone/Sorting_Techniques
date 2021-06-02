import java.util.Scanner;

public class Bubble_Sort {

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
		
		
		
		
		//Bubble Sort Logic
		for (int i=0;i<size-1;i++){
			for(int j=0;j<size-1;j++) {
				if(elements[j]>elements[j+1]) {
					temp=elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
			System.out.print("After pass "+i+" : ");
			for(int k : elements) {
				System.out.print(k+"\t");
			}
			System.out.println();
		
		}
		
		
		//Displaying the elements in ASC Order after bubble sorting
		System.out.println("Elements sorted successfully after bubble sorting are : ");
		for(int i=0;i<size;i++) {
			System.out.print(elements[i]+"\t");
		}
		

	}

}
