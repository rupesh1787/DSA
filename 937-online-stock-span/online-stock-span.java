import java.util.*;

class StockSpanner {

    Stack<int[]> pairs = new Stack<>();

    public StockSpanner() {
        // constructor empty is fine
    }

    public int next(int price) {

        int span = 1;

        while (!pairs.isEmpty() && pairs.peek()[0] <= price) {
            span += pairs.peek()[1];
            pairs.pop();
        }

        pairs.push(new int[]{price, span});
        return span;
    }
}
