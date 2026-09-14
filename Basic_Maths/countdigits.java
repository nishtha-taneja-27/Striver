package Basic_Maths;
import java.util.*;
public class countdigits {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(n==0){
            count=1;
        }
        while(n>0){
            count=count+1;
            n = n/10;
        }
        System.out.print(count);
        sc.close();
    }
}
