import java.util.*; //khai bao thu vien util nhu scanner...
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(); //tao mang khong can biet truoc phan tu
        while(true){
            int n = sc.nextInt();
            if( n == 42){
                break;
            }
            arr.add(n);
        }
        for(int i = 0;i < arr.size();i++){
            System.out.println(arr.get(i)+" "); //lay gia tri tai vi tri i trong mang dong
        }
	}
}