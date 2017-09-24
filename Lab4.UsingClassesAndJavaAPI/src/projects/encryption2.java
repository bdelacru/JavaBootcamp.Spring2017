package projects;

public class encryption2 {
	public static void main(String[] args) {
		String secrete = "To learn to give Is to learn to give in To give upAnd to give way";
		char encrypt[]=new char[secrete.length()];
		char decrypt[]=new char[secrete.length()];
		char tmp;
		//int n=0;
		System.out.println(secrete);
		for(int i=0; i< secrete.length(); i++)
		{
			tmp=secrete.charAt(i);
			encrypt[i]=(char)(((int)tmp)+3);	
			System.out.print(encrypt[i]);
		}
		System.out.println();
		
		for(int a=0; a< secrete.length(); a++)
		{
			
			decrypt[a]=(char)(((int)(encrypt[a]))-3);
			
			System.out.print(decrypt[a]);
		}

	}

}
