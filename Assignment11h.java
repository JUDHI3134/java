/*Write a program to perform following using the numbers in between 23 to 249?
h) Check whether the difference between largest even number and smallest odd
number is palindrome or not?
 */
public class Assignment11h {
    public static void main(String args[]){
        int largestEven,smallestOdd,evenCount =0,oddCount = 0;
        System.out.println("largest Even numbeer : ");
        for(int i=249;i>=23;i--){
            if(i%2==0){
                largestEven=i;
                evenCount++;       
            if(evenCount==2){
                break;
            }
            System.out.println(largestEven);
        }
         
    }
        System.out.println();
         System.out.println("Smallest odd numbeer : ");
         for(int i=23;i<=249;i++){
             if(i%2 !=0){
                smallestOdd=i;
                 oddCount++;
                 if(oddCount==2){
                    break;
                 }
                 System.out.println(smallestOdd);
            
             }
         }

        
    }
}
