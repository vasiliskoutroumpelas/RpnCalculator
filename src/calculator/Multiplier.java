package calculator;

import java.util.Stack;

public class Multiplier extends Operator {
    public Multiplier(Stack<Double> st) {
        super(st);
    }
    
    public void operate() {
        st.push(st.pop() * st.pop());
    }
}
