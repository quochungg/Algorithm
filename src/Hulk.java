import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            if (i % 2 == 0) {
                System.out.print("I love ");
            }else{
                System.out.print("I hate ");
            }if(i!=n){
                System.out.print("that ");
            }else{
                System.out.print("it ");
            }
        }
        sc.close();
    }
}
