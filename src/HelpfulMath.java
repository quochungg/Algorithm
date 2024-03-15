import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] num = line.split("\\+");
        Arrays.sort(num);
        String output = "";
        for (int i = 0; i < num.length; i++) {
            if (i != num.length - 1){
                output += num[i] + "+";
            }else{
                output += num[i];
            }
            
        }
        System.out.println(output);
        sc.close();
    }
}
