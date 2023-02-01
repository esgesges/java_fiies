
public class comparatore {  
	public static void main(String[] args) {
		int c = compareInt(7,3);
		switch(c)
		{
		case 1:
			System.out.println("Il primo numero è maggiore del secondo");
		break;
		case -1:
			System.out.println("Il secondo numero è maggiore del primo");
		break;
		case 0:
			System.out.println("I numeri sono uguali");
		break;
		default:
			System.out.println("Errore");
		}
		
		
		
  }
	public static int compareInt(int a, int b) {
		
		if(a == b)
		{
			return 0;
		} else {
			if(a < b){
				return -1;
			} else {
				return 1;
		}
		}
		
		
	}
}