import java.util.*;

public class ID4 {
    public static int degree(char c){
        if(c == '^') return 5;
        else if(c == '*' || c == '/') return 4;
        else if(c == '+' || c == '-') return 3;
        else return 2;
    }
    public static void main(String args[]) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t > 0){
            Stack<Character> st = new Stack<>();
            String s = sc.nextLine();
            String res = "";
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') res += s.charAt(i);
                else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                    res += s.charAt(i);
                }
                else if(c == '(') st.push(c);
                else if(c == ')'){
                    while(!st.isEmpty() && st.peek() != '('){
                        res += st.peek();
                        st.pop();
                    }
                    st.pop();
                }
                else if(c == '+' || c == '-' || c == '*' || c == '/'){
                    while(!st.isEmpty() && degree(st.peek()) >= degree(c) ){
                        res += st.peek();
                        st.pop();
                    }
                    st.push(c);
                }
            }
            while(!st.isEmpty()){
                if(st.peek() == '(') res += st.peek();
                st.pop();
            }
            System.out.println(res);
            t--;
        }
    }
}