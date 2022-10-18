package calculator;

import java.util.Stack;

public class ResultPresenter extends Operator {
    public ResultPresenter(Stack<Double> st) {
    	super(st);
    }
    
    public void operate() {
        System.out.println(st.peek());
        CalculatorGui.display.setText(String.valueOf(st.pop()));
    }
}
