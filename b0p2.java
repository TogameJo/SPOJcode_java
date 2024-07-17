import java.util.*;

public class b0p2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            if( n == 42){
                break;
            }
            System.out.println(n);
        }
        sc.close();
    }
}