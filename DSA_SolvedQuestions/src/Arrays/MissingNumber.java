package Arrays;

public class MissingNumber 
{
	/*lets say we are given an array of consective natural numbers
	are we are assigned to find the missing number inbetween them*/
	public void missingNumber(int intArray[])
	{
		int sum1 = 0;
		int sum2 = 0;
		for(int i=1; i<=10; i++)
		{
			sum2 = sum2+i;
		}
		/*for(int i=0; i<intArray.length; i++)
		{
			sum1 = sum1+intArray[i];
		}*/
		for(int i: intArray)
		{
			sum1 += i;
		}
		System.out.println("The Missing Number is: " +(sum2-sum1));	
			
	}
	public static void main(String[] args) 
	{
		int intArray[] = {1,2,3,4,5,6,8,9,10};
		MissingNumber mn = new MissingNumber();
		mn.missingNumber(intArray);		
		
	}
	

}
