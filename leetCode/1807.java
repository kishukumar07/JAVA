class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        Map<String, String> myHashMap = new HashMap<>();

        //    myHashMap.put("k","1"); 
        //    System.out.println(myHashMap.get("k"));

        //  System.out.println(knowledge.size());  // .add() , .get() :list

        int n = knowledge.size();
        int m = s.length();

        for (int i = 0; i < n; i++) {
            String key = knowledge.get(i).get(0);
            String value = knowledge.get(i).get(1);
            myHashMap.put(key, value);
        }

        // System.out.println(myHashMap); 

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {

            char c = s.charAt(i);

            if (c == '(') {
                int start = i + 1;
                while (s.charAt(i) != ')') {
                    i++;
                }
                String key = s.substring(start, i);
                String value = myHashMap.getOrDefault(key, "?");
                sb.append(value);

            } else {
                sb.append(c);
            }

        }

        return sb.toString();

    }
}