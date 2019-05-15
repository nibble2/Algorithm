package Solution_1289;

import java.util.Scanner ;

public class main_1289 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			char [] num = sc.next().toCharArray();
			char [] copy = new char[num.length] ;
			int cnt = 0;
			
			for(int j=0; j<num.length; j++) { copy[j] = '0' ; } 
			
			for(int j=0; j<num.length; j++) {
				if(num[j] != copy[j]) {
					for(int k=j; k<num.length; k++) {
						if(num[j] == '1') {
							copy[k] = '1';
						} else {
							copy[k] = '0' ;
						}
					}
					cnt ++ ;
				}
			}
			System.out.printf("#%d %d \n", i, cnt);
		}
	}
}
