import java.util.ArrayList;
import java.util.Scanner;

public class Monster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test case
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            int n, k;
            n = sc.nextInt();// number of monster
            k = sc.nextInt();// damamge
            sc.nextLine();
            ArrayList<Integer> monsterList = new ArrayList<>();
            ArrayList<Integer> indices = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                monsterList.add(sc.nextInt());
            }
            while (check(monsterList)) {
                int maxIndex = findMaxIndex(monsterList);
                int healthRemain = monsterList.get(maxIndex) - k;
                if (healthRemain <= 0) {
                    indices.add(maxIndex + 1);
                }
                monsterList.set(maxIndex, healthRemain);

            }
            for (int j = 0; j < indices.size(); j++) {
                System.out.print(indices.get(j) + " ");
            }
            System.out.println();
        }
        sc.close();

    }

    private static int findMaxIndex(ArrayList<Integer> list) {
        int index = 0;
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
                index = i;
            }
        }
        return index;
    }

    private static boolean check(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                return true;
            }
        }
        return false;
    }

}
