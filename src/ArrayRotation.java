import java.util.Scanner;

public class ArrayRotation {
    static int[] reverseTheArray(int[] A, int i, int j){
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        return A;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        System.out.println("Array elements: ");
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        int i = 0, j = array.length-1;
        array = reverseTheArray(array, i, j);
        System.out.print("Enter B: ");
        int B = scanner.nextInt();
        if(B>array.length){
            B = B%array.length;
        }
        array = reverseTheArray(array, 0, B-1);
        array = reverseTheArray(array, B, array.length-1);
        for (i = 0; i < array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
