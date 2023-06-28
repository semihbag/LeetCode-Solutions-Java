public class _2293_Min_Max_Game {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
    	if (n == 1) {
    		return nums[0];
    	}
    	
    	int[] newNums = new int[n/2];
    	
    	for (int i = 0; i < n/2; i++) {
			int i_ = i*2;
			int a;
			
    		if (i%2 ==0) {
    			a = (nums[i_] < nums[i_ +1])? nums[i_] : nums[i_ +1];
    		}
    		else {
    			a = (nums[i_] > nums[i_ +1])? nums[i_] : nums[i_ +1];
    		}
			newNums[i] = a;
    	}
    
    return minMaxGame(newNums);
    }
}