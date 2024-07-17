import java.util.*;

class Main{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(a.contains(b)){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}