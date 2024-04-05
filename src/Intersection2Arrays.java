import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection2Arrays {
        public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pnums1 = 0;
        int pnums2 = 0;
        while(pnums1 < nums1.length && pnums2 < nums2.length){
            if(nums1[pnums1] == nums2[pnums2]){
                set.add(nums1[pnums1]);
                pnums1++;
                pnums2++;
            } else if(nums1[pnums1] > nums2[pnums2]){
                pnums2++;
            } else {
                pnums1++;
            }
        }
        int[] output = new int[set.size()];
        int i = 0;
        for (Integer num : set){
            output[i] = num;
            i++;
        }
        return output;
    }
}
