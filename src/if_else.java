import java.util.ArrayList;

public class if_else {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2==0) //% will be added as division, which int divide by 2 will be shown as output, Ex: arr[i] % 5==0 gives 5 
			{
				System.out.println(arr[i]);
				break;
			}
			
			else
			{
				System.out.println(arr[i] + "is not multiple of 2");
			}
		}
		
		ArrayList <String> a= new ArrayList <String>();
		
		a.add("Ripal");
		a.add("Ankit");
		a.add("Chauhan");
		
		System.out.println(a.get(1));
		
		
	}
}
