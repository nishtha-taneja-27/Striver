package Basic_Maths;
import java.util.*;
public class primeNo {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        for(int i = 2; i<n; i++){
            if(n%i==0){
                flag = 1;
            }
        }
        if(flag==1){
            System.out.print("Composite number!");
        }
        else{
            System.out.print("Prime number!");
        }
        sc.close();
    }
}
