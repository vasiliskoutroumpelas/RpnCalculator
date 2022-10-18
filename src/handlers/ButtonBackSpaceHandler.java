package handlers;

import calculator.CalculatorGui;
import calculator.Operand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonBackSpaceHandler implements ActionListener {
    Operand op;
    public ButtonBackSpaceHandler(Operand op) {
        this.op = op;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        op.deleteLastDigit();
        System.out.println(op.buffer);
        if (!op.buffer.isEmpty())
            CalculatorGui.display.setText(String.valueOf(op.buffer));
        else
            CalculatorGui.display.setText("0");
    }
}
