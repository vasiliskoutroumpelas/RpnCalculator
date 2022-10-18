package handlers;

import calculator.CalculatorGui;
import calculator.Operator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;

public class ButtonOperatorHandler implements ActionListener {
    Operator operator;
    public ButtonOperatorHandler(Operator operator) {
        this.operator = operator;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            operator.operate();
        }
        catch (EmptyStackException exception) {
            CalculatorGui.warningBoxForStack(exception);
        }
    }
}
