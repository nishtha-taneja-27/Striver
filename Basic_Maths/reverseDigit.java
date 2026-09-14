package Basic_Maths;
import java.util.*;
public class reverseDigit {
    public static  void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int revNum = 0;
    int temp;
    if(n<0){
        temp = -n;
    }
    else{
        temp = n;
    }
    while(temp>0){
        int rem = temp%10;
        revNum=revNum*10+rem;
        temp = temp/10;
    }
    if(n<0){
        System.out.print(-revNum);
    }
    else{
        System.out.print(revNum);
    }
    sc.close();
}
}
