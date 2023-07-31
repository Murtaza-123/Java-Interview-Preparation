
public class FindPivot {

    public static void main(String[] args) {
        int[] array = {2,1,-1};
        System.out.println(Find.findIndex(array));
    }
}

class Find {

    public static int findIndex(int[] nums) {
         int leftsum = 0; 
        int rightsum = 0;
        
        for(int i =1; i< nums.length; i++){
            rightsum += nums[i];
        
        
        if (leftsum == rightsum){
            return 0;
        }
    }
        
        for(int i = 1 ; i < nums.length; i++){
            leftsum += nums[i-1];
            rightsum -= nums[i];
            
            if(leftsum == rightsum) {
                return i;
        }
        }
        return -1;
    }
}