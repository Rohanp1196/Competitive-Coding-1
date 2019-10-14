import java.io.*;

class GFG {
    
    public static int CalculateMissing(int nums[]){
        
        int low =0;
        int high = nums.length-1;
        
        
        while(low<=high){
            
            int mid = low +(high-low)/2;
            
            if (mid != nums[mid] - 1){
                
                if(mid == low || nums[mid-1] - 1 == mid-1){
                    
                    return mid +1;
                }
                else{
            
                    high  = mid -1;
                }
        
                
            }
            
            else{
                low = mid +1;
            }
            
            
        }
        
        return -1;
        
        
    }
    
    public static void main (String[] args) {
        
        int[] nums = {1,2,3,4,5,6,8}; 
        
        System.out.println(CalculateMissing(nums));
    }
}






Message Yash


About this conversation


