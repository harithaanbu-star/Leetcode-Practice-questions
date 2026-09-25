class Solution {

    TreeSet<String> set = new TreeSet<>();

    public List<String> braceExpansionII(String expression) {

        dfs(expression);

        return new ArrayList<>(set);
    }

    private void dfs(String exp) {

        // No more braces
        if (!exp.contains("}")) {
            set.add(exp);
            return;
        }

        // Find first '}'
        int close = exp.indexOf('}');

        // Find matching '{'
        int open = exp.lastIndexOf('{', close);

        // Before the braces
        String left = exp.substring(0, open);

        // After the braces
        String right = exp.substring(close + 1);

        // Content inside braces
        String inside = exp.substring(open + 1, close);

        // Split by comma
        String[] choices = inside.split(",");

        // Try every choice
        for (String choice : choices) {

            String newExp = left + choice + right;

            dfs(newExp);
        }
    }
}