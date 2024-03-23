import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int output = 0;
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            if(line.substring(0, 2).equals("++")|| line.substring(line.length()-2).equals("++")){
                output ++;
            }else{
                output--;
            }
        }
        System.out.println(output);
        sc.close();
    }
}
