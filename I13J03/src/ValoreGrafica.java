import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ValoreGrafica {
		public static void main(String[] args) {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			Random rand = new Random();
			int n1, n2, n3;
			String c = " ";
			n1 = (rand.nextInt(20)) + 1;
			n2 = (rand.nextInt(20)) + 1;
			n3 = (rand.nextInt(20)) + 1;
			
			// MOSTRARE N1
			
			System.out.print(n1 + " ");
			for (int q1 = 0;q1<n1;q1++)
			{
				System.out.print("*");
			}
			System.out.print("\n" + n2 + " ");
			for (int q2 = 0;q2<n2;q2++)
			{
				System.out.print("*");
			}
			System.out.print("\n" + n3 + " ");
			for (int q3 = 0;q3<n3;q3++)
			{
				System.out.print("*");
			}
	}
}