import java.util.*;

public class ThreeSum{
	public static List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> res = new ArrayList<>();
		
		int n= nums.length;
		
		Arrays.sort(nums);
		
		for(int i=0;i<n;i++){
			
			for(int j=i+1;j<n;j++){
				
				for(int k=j+1;k<n;k++){
					
					if(nums[i]+nums[j]+nums[k] == 0){
						
						List<Integer> triplet = Arrays.asList(nums[i],nums[j],nums[k]);
						
						if(!res.contains(triplet)){
							
							res.add(triplet);
						}
					}
				}
			}
		}
		return res;
	
	}
	public static void main(String args[]){
		int [] nums = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
	}
}