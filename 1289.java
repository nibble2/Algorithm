import java.util.* ;

public class 1289 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(system.in) ;
        int T = sc.nextInt() ;
        
        for (int k = 1; k <= T; k++){
            int num = sc.nextInt() ;
            int [] array = new int[num] ;
            int i=0 ;
            
            for (int i=0; i<array.length() ; i++) {
                if (array[i] == 1) {
                    for (int j=i; j<array.length(); j++) {
                        array[j] = 1 ;      
                    }

                } else (array[i] == 0) {
                    for (int j=i; j<array.length(); j++) {
                        array[j] = 0 ;
                    }
                }
            }
            System.out.println(num) ;
        }
    }
}