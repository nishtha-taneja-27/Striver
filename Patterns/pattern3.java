package Patterns;
import java.util.*;
public class pattern3 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr[] = new String[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    arr[i][j] = "*";
                }
                else{
                    arr[i][j] = " ";
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        } 
        
        sc.close();
    }
}
