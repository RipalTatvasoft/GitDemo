
public class coreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] variable = new int[5];

		variable[0]= 1;
		variable[1]=3;
		variable[2]=5;
		variable[3]=7;
		variable[4]=9;

		System.out.println(variable[4]);

		//Array
		int[] arr = {1,2,3,4,5};

		System.out.println(arr[0]);

		//For loop
		for(int i=0; i<variable.length; i++)
		{
			System.out.println(variable[i]);
		}
		
		String[] name = {"Ripal", "Maheshbhai", "Chauhan"};
		
		for (int i = 0; i<name.length; i++)
			
		{
			System.out.println(name[i]);
		}
		
		for (String s :name)
		{
			System.out.println(s);
		}
		
	}

}
