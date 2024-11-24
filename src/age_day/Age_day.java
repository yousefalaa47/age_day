
package age_day;
import java .util.* ;
public class Age_day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int d = 0;
        int m = 0 ;
        int y = (x / 365) ;
        if (x % 365 == 0) {
        System.out.println(y + " years");
        System.out.println(0 + " months");
        System.out.println(0 + " days");
        }
        else{
        int r = 0 ;
        for (int i = x; i > 365; i = i-365) {
            r = i ;
        }
        if (r > 365) {
            r = r - 365 ;
        }
        
        if (r >= 30) {
           m = (r / 30);  
        }
        if (r < 30) {
                d = r ;
            }
        if (x < 365) {
            m = (x / 30);
            d = x - (m * 30);
        }
       
        for (int i = r; i > 30; i = i-30) {
            d = i ;
        }

        if (x < 30) {
            d = x ;
        }
        if (d > 30) {
           d = d - 30 ; 
        }
        if (d == 30) {
            d = 0 ;
        }
        
        System.out.println(y + " years");
        System.out.println(m + " months");
        System.out.println(d + " days");
    }
    }
    
}
