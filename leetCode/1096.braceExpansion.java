import java.util.*;

class Solution {
    private int idx = 0;
    
    public List<String> braceExpansionII(String expression) {
        idx = 0;
        Set<String> res = parseExpression(expression);
        return new ArrayList<>(res);
    }

    // Top-level recursive function: handles expressions separated by ','
    private Set<String> parseExpression(String expr) {
        Set<String> unionSet = new TreeSet<>();
        
        // Initial set for Cartesian product within a comma-separated block
        Set<String> concatSet = new TreeSet<>();
        concatSet.add("");

        while (idx < expr.length() && expr.charAt(idx) != '}') {
            char c = expr.charAt(idx);

            if (c == ',') {
                // End of current comma-separated segment: add to union set
                unionSet.addAll(concatSet);
                
                // Reset concatSet for the next segment
                concatSet = new TreeSet<>();
                concatSet.add("");
                idx++; // Move past ','
            } else {
                // Get the next atomic unit (letter or evaluated bracket expression)
                Set<String> unitSet = parseUnit(expr);
                
                // Concatenate current unit set with running concat set (Cartesian product)
                concatSet = CartesianProduct(concatSet, unitSet);
            }
        }

        // Merge remaining concatenated segment into the union result
        unionSet.addAll(concatSet);
        return unionSet;
    }

    // Atom function: parses a single unit (either letters or sub-expressions inside '{...}')
    private Set<String> parseUnit(String expr) {
        Set<String> unitSet = new TreeSet<>();
        char c = expr.charAt(idx);

        if (Character.isLetter(c)) {
            // Read standard lowercase letter group or character
            StringBuilder sb = new StringBuilder();
            while (idx < expr.length() && Character.isLetter(expr.charAt(idx))) {
                sb.append(expr.charAt(idx));
                idx++;
            }
            unitSet.add(sb.toString());
        } else if (c == '{') {
            idx++; // Move past '{'
            unitSet = parseExpression(expr); // Recurse inside braces
            idx++; // Move past '}'
        }

        return unitSet;
    }

    // Helper to compute Cartesian Product of two string sets
    private Set<String> CartesianProduct(Set<String> set1, Set<String> set2) {
        Set<String> res = new TreeSet<>();
        for (String s1 : set1) {
            for (String s2 : set2) {
                res.add(s1 + s2);
            }
        }
        return res;
    }
}