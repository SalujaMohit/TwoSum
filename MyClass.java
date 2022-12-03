
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      
      int[] nums = {1,2,3,4};
      twoSum(nums,6);
      
    }
    
     public static void twoSum(int[] nums, int target) {
        
        ArrayList ts = new ArrayList();
        
        for(int x : nums){
            ts.add(x);
        }
        
        int i =0;
        
        for(int x : nums){
            if(ts.contains(target-x) && i!=(ts.indexOf(target - x))){
                System.out.println(i);
                System.out.println(ts.indexOf(target - x));
                break;
            }
                i++;
        }
    
    }
}
