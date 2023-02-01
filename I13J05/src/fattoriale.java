public class fattoriale {  
	public static void main(String[] args) {
		
		int risultato = factorial(6);
		System.out.println(risultato);
		
	}
	public static int factorial(int a)
	{
		int c = 1;
		for(int p = a; p>0; p--)
		{
			c = c * p;
		}
		return c;
	}
}