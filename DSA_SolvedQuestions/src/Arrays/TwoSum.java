package Arrays;

public class TwoSum 
{
	public void twoSum(int[] nums, int target)
    {
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i; j<nums.length; j++)
            {
                if((nums[i] + nums[j]) == target)
                {
                    System.out.print("["+nums[i]+","+nums[j]+"]");
                }
            }
        }
    }
	public static void main(String[] args) 
	{
		int nums[] = {1,2,3,4,5,6,7,8,9};
		int target = 8;
		TwoSum ts = new TwoSum();
		ts.twoSum(nums, target);

	}

}
