import java.util.*;

class Main {
    public static boolean isPrime(int n) {
        if(n <= 1){
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int i = a; i <= b; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
            t--;
        }
        sc.close();
    }
}
