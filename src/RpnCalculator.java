import calculator.*;

import java.util.Stack;
public class RpnCalculator {
    public static void main(String[] args) {
        Stack<Double> st = new Stack<>();
        Operand op = new Operand(st);
        Adder add = new Adder(st);
        Subtractor sub = new Subtractor(st);
        Multiplier mul = new Multiplier(st);
        Divider div = new Divider(st);
        ResultPresenter rp = new ResultPresenter(st);
        new CalculatorGui("RPN Calculator", op, add,sub, mul, div, rp);
    }
}
