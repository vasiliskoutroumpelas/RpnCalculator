package calculator;

import java.util.Stack;

public class Adder extends Operator {
    public Adder(Stack<Double> st) {
        super(st);
    }
    
    public void operate() {
        st.push(st.pop() + st.pop());
    }
}
