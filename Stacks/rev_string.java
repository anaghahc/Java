import java.util.Stack;

public class rev_string {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "Anagha";
        for(int i = 0; i<str.length();i++){
            stack.push(str.charAt(i));
        }
        char arr[] = new char[str.length()];
        for(int i = 0; i<str.length();i++){
            arr[i] = stack.pop();
        }
        String ans = new String(arr);
        System.out.println(ans);
    }
}
