import java.util.Scanner;
class arrayy{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array :");
        int size = sc.nextInt();

        int number[] = new int[size];
        System.out.println("Enter array element :");
        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.print("The Array Element are :");
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
            if(number[i]==x){
                System.out.println();
                System.out.println("x found at index "+i);
            }
        }
        
    }
}