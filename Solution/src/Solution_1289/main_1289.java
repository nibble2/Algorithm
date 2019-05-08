package Solution_1289;

import java.util.Scanner ;

public class main_1289 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int T = sc.nextInt();
		int cnt = 0;
		
		for(int i=1; i<=T; i++) {
			int num = sc.nextInt() ;
			int [] array = new int[num] ;
			int [] copy = {0,0,0,0} ;
			
			if(array[2] != copy[2]) {
				System.out.println(true) ;
			}
			
			for(int j=0; j<array.length; j++) {
				if(array[j] != copy[j]) {
					cnt ++ ;
					for(j=0; j<array.length; j++) {
						copy[j] = 1;
					}
				}
			}
		}
		for(int i=1; i<=T; i++) {
			System.out.printf("#%d %d \n", i, cnt);			
		}
	}
	
}
