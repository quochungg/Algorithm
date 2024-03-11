import java.util.Scanner;

public class StoneOnTheTable {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int quantity = sc.nextInt();
        sc.nextLine();
        String color = sc.nextLine();
        for(int i = 0; i <quantity-1; i++){
            if (color.charAt(i)==color.charAt(i+1)){
                result++;
            }
        }
        System.out.println(result);
        sc.close(); 
    }
}
