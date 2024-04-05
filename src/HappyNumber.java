import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        if (n == 1)
            return true;
        while (n != 0) {
            if (set.contains(n)) {
                return false;
            } else {
                set.add(n);
            }
            int newNums = 0;
            while (n != 0) {
                newNums += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = newNums;
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
}
