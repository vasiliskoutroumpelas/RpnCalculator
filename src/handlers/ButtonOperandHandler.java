package handlers;

import calculator.CalculatorGui;
import calculator.Operand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonOperandHandler implements ActionListener {
    Operand op;
    char operand;
    public ButtonOperandHandler(Operand op, char operand) {
        this.op = op;
        this.operand = operand;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        op.addDigit(operand);
        CalculatorGui.display.setText(String.valueOf(op.buffer));
    }
}
