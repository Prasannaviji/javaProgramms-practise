package group4;

public class PrintElementOfArrayInDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,60,65,48,20,15};
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[i]<arr[j]) //condition to check which number is greater
				{
					int temp =arr[i]; //use temp variable to store greater values
					arr[i]=arr[j];    //swapping
					arr[j]=temp;
					
				}
				
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);	
		}
		

	}

	}


