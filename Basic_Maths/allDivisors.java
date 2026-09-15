package Basic_Maths;
import java.util.*;
public class allDivisors {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
         for(int i = 1; i<=n; i++){
            if(n%i==0){
                list.add(i);
            }
        }
        System.out.print(list);
        sc.close();
    }
}
