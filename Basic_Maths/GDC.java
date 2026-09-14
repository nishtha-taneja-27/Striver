package Basic_Maths;
import java.util.*;
public class GDC {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                list1.add(i);
            }
        }
        for(int i = 1; i<=m; i++){
            if(m%i==0){
                list2.add(i);
            }
        }
        for (int i = list1.size() - 1; i >= 0; i--) {
            if (list2.contains(list1.get(i))) {
                System.out.println("GCD = " + list1.get(i));
                break;
            }
        }

        sc.close();
    }
}
