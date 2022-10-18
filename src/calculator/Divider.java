package calculator;

import javax.swing.*;
import java.util.Stack;

public class Divider extends Operator {
    public Divider(Stack<Double> st) {
    	super(st);
    }
    
    public void operate() {
    	Double diairetis = st.pop();
        Double diaireteos = st.pop();
        if(diairetis == 0)
            JOptionPane.showMessageDialog(null, "You can't divide by zero", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        else
            st.push(diaireteos / diairetis);
    }
}
