class StockSpanner {
    
    class Stock{
        int price;
        int span;
        Stock(int price, int span){
            this.price = price;
            this.span = span;
        }
    }
    
    Stack<Stock> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        Stock s = new Stock(price, 1);
        if (stack.isEmpty()){
            stack.add(s);
        } else {
            Stock t = stack.pop();
            while (t.price <= s.price){
                s.span += t.span;
                if (stack.isEmpty()){
                    break;
                }
                t = stack.pop();
            }
            if (t.price > s.price){
                stack.add(t);
            }
            stack.add(s);
        }
        return stack.peek().span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */