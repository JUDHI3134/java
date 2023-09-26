/*Write a program to perform following using the numbers in between 23 to 249?
 * i) find first five largest even number and smallest odd number?
 */
public class Assignment11i {
    public static void main(String args[]){
        int evenCount = 0,oddCount = 0;
        System.out.println("First five largest Even numbeer : ");
        for(int i=249;i>=23;i--){
            if(i%2==0){
                evenCount++;
                if(evenCount == 6){
                    break;
                }
                System.out.print(i+" , ");
            }
        }
        System.out.println();
        System.out.println("First five Smallest odd numbeer : ");
        for(int i=23;i<=249;i++){
            if(i%2 !=0){
                oddCount++;
                if(oddCount == 6){
                    break;
                }
                System.out.print(i+" , ");
            }
        }
    }
}
