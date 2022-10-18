package handlers;

import calculator.CalculatorGui;
import calculator.Operand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEnterHandler implements ActionListener {
    Operand op;
    public ButtonEnterHandler(Operand op) {
        this.op = op;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            op.complete();
            if (!op.st.isEmpty())
                CalculatorGui.display.setText(String.valueOf(op.st));
            else
                CalculatorGui.display.setText("Start by entering the operands");
        }catch (NumberFormatException exception) {
            CalculatorGui.warningBoxForMultiplePoints(exception);
        }
    }
}
