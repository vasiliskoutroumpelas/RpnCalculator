package handlers;

import calculator.CalculatorGui;
import calculator.Operand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClearHandler implements ActionListener {
    Operand op;
    public ButtonClearHandler(Operand op) {
        this.op = op;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        op.deleteLastEntry();

        if (!op.st.isEmpty())
            CalculatorGui.display.setText(String.valueOf(op.st));
        else
            CalculatorGui.display.setText("0");
    }
}
