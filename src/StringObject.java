
public class StringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create string in different types
		
		//Create object
		
		String a= new String("Ripal");
		String a1= new String ("Chauhan");
		
		//String literal
		
		String b= "Ripal Ankit Chauhan";
		
		String [] splittedstring = b.split("Ankit");
		
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[1].trim());
		
		//string print
		for(int i=0;i<b.length();i++)
			
		{
			System.out.println(b.charAt(i));
		}
			
		//Revese string
		
		for (int i=b.length()-1;i>=0;i--)
		{
			System.out.println(b.charAt(i));
		}

		
		

	}

}
