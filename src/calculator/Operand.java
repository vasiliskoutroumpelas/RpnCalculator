package calculator;

import java.util.Stack;
public class Operand implements OperandIf {
    public Stack<Double> st;
    public StringBuffer buffer = new StringBuffer();

    /* CONSTRUCTOR */
    public Operand(Stack<Double> st) {
        this.st = st;
    }

    private void printBuffer() {
        System.out.println(buffer);
    }
    private void resetBuffer() {
        buffer.delete(0, buffer.length());
        printBuffer();
    }

    public void addDigit(char digit) {
        buffer.append(digit);
        printBuffer();
    }

    public void deleteLastDigit() {
        if(buffer.length() > 0) {
            buffer.deleteCharAt(buffer.length()-1);
            printBuffer();
        }
    }

    public void deleteLastEntry() {
        if(!st.isEmpty()){
            st.remove(st.lastElement());
        }
    }

    public void reset() {
        resetBuffer();                  
        st.removeAllElements();
    }

    public void complete() {
        if(buffer.length() > 0) {
            st.push(Double.parseDouble(buffer.toString())); //buffer -> String -> Double
            System.out.println(st);                         //preview of Doubles in Stack st
            resetBuffer();
        }
    }
}
