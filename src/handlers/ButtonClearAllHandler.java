package handlers;

import calculator.CalculatorGui;
import calculator.Operand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClearAllHandler implements ActionListener {
    Operand op;
    public ButtonClearAllHandler(Operand op) {
        this.op = op;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        op.reset();
        CalculatorGui.display.setText("0");
    }
}
