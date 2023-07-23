import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			//String input=sc.next();
                String line = sc.nextLine();
            boolean result = isBalanced(line);
            System.out.println(result);
        }
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> closingToOpening = new HashMap<>();
        closingToOpening.put(')', '(');
        closingToOpening.put('}', '{');
        closingToOpening.put(']', '[');

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty() || stack.peek() != closingToOpening.get(ch)) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
