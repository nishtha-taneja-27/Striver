package Patterns;

public class pattern2 {
    public static void main(String[] arg){
        for(int i = 1; i<=5; i++){
           // for spaces
           for(int j=0; j<5-i; j++){
            System.out.print(" ");
           }
           for(int j = 0; j< 2*i-1; j++){
            System.out.print("*");
           }
           System.out.println();
        }
        for(int i = 1; i <=5; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<2*5-(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
