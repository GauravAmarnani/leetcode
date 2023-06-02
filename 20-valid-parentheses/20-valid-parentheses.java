class Solution {
    public boolean isValid(String str) {
        ArrayList<String> parenthesis = new ArrayList<>();
        parenthesis.add(0, "{");
        parenthesis.add(1, "}");
        parenthesis.add(2, "(");
        parenthesis.add(3, ")");
        parenthesis.add(4, "[");
        parenthesis.add(5, "]");
        ArrayList<Integer> stack = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            String temp = str.charAt(i) + "";
            if(parenthesis.contains(temp)) {
                if(parenthesis.indexOf(temp) % 2 != 0) {
                    if(stack.size()==0)
                        return false;
                    if (stack.get(stack.size() - 1) == parenthesis.indexOf(temp) - 1) {
                        String current = stack.get(stack.size() - 1) + "";
                        int index = stack.lastIndexOf(Integer.parseInt(stack.get(stack.size() - 1) + ""));
                        stack.remove(index);
                    } else {
                        return false;
                    }
                }
                else {
                    stack.add(parenthesis.indexOf(temp));
                }
            }
        }
        return stack.size() == 0;
    }
}