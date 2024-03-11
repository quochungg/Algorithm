import java.util.Scanner;

/**
 * SolierAndBanana
 */
public class SolierAndBanana {

    public static void main(String[] args) {
        int n,w,k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt(); //the cost of the first banana
        n = sc.nextInt(); //initial number of dollars
        w = sc.nextInt(); //number of bananas he wants
        
        for (int i = 1; i <= w ; i++) {
            n -= (i*k);
        }
        int result;
        if (n >= 0){
            result = 0;
        }else{
            result = n*-1;
        }
        System.out.println(result);
        sc.close();
    }
}