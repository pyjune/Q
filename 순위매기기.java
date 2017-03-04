import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {

	public static void main(String[] args) throws Exception{
		
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int [] jum;
		int [] rank;
		for(int tc = 1; tc<=T;tc++)
		{
			int N = sc.nextInt();
			jum = new int[N];
			rank = new int[N];
			
			for(int i = 0; i<N; i++)
			{
				jum[i] = sc.nextInt();
				rank[i] = 1;
			}
			for( int i = 0; i<N; i++ )
			{
				for(int j = 0; j<N; j++)
				{
					if(jum[i]<jum[j])
						rank[i]++;
				}
			}
			
			
			System.out.printf("#%d", tc);
			for(int i = 0; i<N; i++)
				System.out.print(" " + rank[i]);
			System.out.println();
		}
	}

}

