class Solution {
    public String reverseParentheses(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                stack.push(str.length());
            } 
            else if (ch == ')') {
                int start = stack.pop();

                int left = start;
                int right = str.length() - 1;

                while (left < right) {
                    char temp = str.charAt(left);
                    str.setCharAt(left, str.charAt(right));
                    str.setCharAt(right, temp);

                    left++;
                    right--;
                }
            } 
            else {
                str.append(ch);
            }
        }

        return str.toString();
    }
}