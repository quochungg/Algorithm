import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>(); 
        for (Integer num : nums){
            if(!set.contains(num)){
                set.add(num);
            }else{
            set.remove(num);
            }
        }
        List<Integer> list = new ArrayList<Integer>(set); 
        return list.get(0);
    }
}
