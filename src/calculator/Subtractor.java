package calculator;

import java.util.Stack;

public class Subtractor extends Operator {
    public Subtractor(Stack<Double> st) {
    	super(st);
    }

    public void operate() {
    	Double afairetos = st.pop();
        Double meiwteos = st.pop();
        st.push(meiwteos-afairetos);
    }
}
