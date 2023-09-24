import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[] = new int[size];

        System.out.println("Enter Array element :");
        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }
        Arrays.sort(number);
        System.out.println("Sorted array element are :");
        // for(int i =0;i<number.length;i++){
        //     System.out.println(number[i]);
        // }
        for(int b:number){
            System.out.print(b+" ");
        }
    }
}
