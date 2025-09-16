import java.util.*;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> stack = new ArrayList<>();
        
        for (int x : nums) {
            stack.add(x);
            // keep merging while last two are non-coprime
            while (stack.size() > 1) {
                int a = stack.get(stack.size() - 1);
                int b = stack.get(stack.size() - 2);
                int g = gcd(a, b);
                
                if (g > 1) { // non-coprime
                    long lcm = (long) a / g * b; // compute LCM safely
                    stack.remove(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                    stack.add((int) lcm);
                } else {
                    break;
                }
            }
        }
        
        return stack;
    }

    // helper gcd function
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
