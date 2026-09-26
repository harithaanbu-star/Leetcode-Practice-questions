class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        // 1. Store knowledge in HashMap
        HashMap<String, String> map = new HashMap<>();

        for (List<String> list : knowledge) {
            map.put(list.get(0), list.get(1));
        }

        // 2. Build the answer
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                // Find closing bracket
                int j = s.indexOf(')', i);

                // Extract key
                String key = s.substring(i + 1, j);

                // Get value, otherwise ?
                ans.append(map.getOrDefault(key, "?"));

                // Skip the entire "(key)"
                i = j;

            } else {
                // Normal character
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}