package calculator;

import handlers.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.EmptyStackException;

@SuppressWarnings("all")
public class CalculatorGui extends Frame{
    private static final int BW = 45;
    private static final int BH = 28;
    private static final int SPACE = 5;

    private Button button0;
    private Button buttonSubdialect;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonEnter;
    private Button buttonAdder;
    private Button buttonSubtractor;
    private Button buttonMultiplier;
    private Button buttonDivider;
    private Button buttonBackSpace;
    private Button buttonClear;
    private Button buttonClearAll;
    private Button buttonResultPresenter;

    public static TextField display;

    public CalculatorGui(String title, Operand op, Adder add, Subtractor sub, Multiplier mul, Divider div,
                         ResultPresenter rp) {
        super(title);

        this.setLayout(null);
        this.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        this.setBackground(Color.gray);

        button0 = new Button("0");
        button0.setBounds(xNumPad(0), yNumPad(0),(2*BW)+5,BH);
        button0.setForeground(Color.blue);
        button0.addActionListener(new ButtonOperandHandler(op,'0'));
        this.add(button0);

        buttonSubdialect = new Button(".");
        buttonSubdialect.setBounds(xNumPad(2), yNumPad(0),BW,BH);
        buttonSubdialect.setForeground(Color.blue);
        buttonSubdialect.addActionListener(new ButtonOperandHandler(op,'.'));
        this.add(buttonSubdialect);

        button1 = new Button("1");
        button1.setBounds(xNumPad(0), yNumPad(1),BW,BH);
        button1.setForeground(Color.blue);
        button1.addActionListener(new ButtonOperandHandler(op,'1'));
        this.add(button1);

        button2 = new Button("2");
        button2.setBounds(xNumPad(1), yNumPad(1),BW,BH);
        button2.setForeground(Color.blue);
        button2.addActionListener(new ButtonOperandHandler(op,'2'));
        this.add(button2);

        button3 = new Button("3");
        button3.setBounds(xNumPad(2), yNumPad(1),BW,BH);
        button3.setForeground(Color.blue);
        button3.addActionListener(new ButtonOperandHandler(op,'3'));
        this.add(button3);

        button4 = new Button("4");
        button4.setBounds(xNumPad(0), yNumPad(2),BW,BH);
        button4.setForeground(Color.blue);
        button4.addActionListener(new ButtonOperandHandler(op,'4'));;
        this.add(button4);

        button5 = new Button("5");
        button5.setBounds(xNumPad(1), yNumPad(2),BW,BH);
        button5.setForeground(Color.blue);
        button5.addActionListener(new ButtonOperandHandler(op,'5'));
        this.add(button5);

        button6 = new Button("6");
        button6.setBounds(xNumPad(2), yNumPad(2),BW,BH);
        button6.setForeground(Color.blue);
        button6.addActionListener(new ButtonOperandHandler(op,'6'));
        this.add(button6);

        button7 = new Button("7");
        button7.setBounds(xNumPad(0), yNumPad(3),BW,BH);
        button7.setForeground(Color.blue);
        button7.addActionListener(new ButtonOperandHandler(op,'7'));
        this.add(button7);

        button8 = new Button("8");
        button8.setBounds(xNumPad(1), yNumPad(3),BW,BH);
        button8.setForeground(Color.blue);
        button8.addActionListener(new ButtonOperandHandler(op,'8'));;
        this.add(button8);

        button9 = new Button("9");
        button9.setBounds(xNumPad(2), yNumPad(3),BW,BH);
        button9.setForeground(Color.blue);
        button9.addActionListener(new ButtonOperandHandler(op,'9'));
        this.add(button9);

        buttonEnter = new Button("ENTER");
        buttonEnter.setBounds(xNumPad(3), yNumPad(3),(2*BW)+5,BH);
        buttonEnter.setForeground(Color.blue);
        buttonEnter.addActionListener(new ButtonEnterHandler(op));
        this.add(buttonEnter);

        buttonAdder = new Button("+");
        buttonAdder.setBounds(xNumPad(3), yNumPad(1),BW,BH);
        buttonAdder.setForeground(Color.blue);
        buttonAdder.addActionListener(new ButtonOperatorHandler(add));
        this.add(buttonAdder);

        buttonSubtractor = new Button("-");
        buttonSubtractor.setBounds(xNumPad(4), yNumPad(1),BW,BH);
        buttonSubtractor.setForeground(Color.blue);
        buttonSubtractor.addActionListener(new ButtonOperatorHandler(sub));
        this.add(buttonSubtractor);

        buttonMultiplier = new Button("*");
        buttonMultiplier.setBounds(xNumPad(3), yNumPad(2),BW,BH);
        buttonMultiplier.setForeground(Color.blue);
        buttonMultiplier.addActionListener(new ButtonOperatorHandler(mul));
        this.add(buttonMultiplier);

        buttonDivider = new Button("/");
        buttonDivider.setBounds(xNumPad(4), yNumPad(2),BW,BH);
        buttonDivider.setForeground(Color.blue);
        buttonDivider.addActionListener(new ButtonOperatorHandler(div));
        this.add(buttonDivider);

        buttonResultPresenter = new Button("=");
        buttonResultPresenter.setBounds(xNumPad(3), yNumPad(0),(2*BW)+SPACE,BH);
        buttonResultPresenter.setForeground(Color.blue);
        buttonResultPresenter.addActionListener(new ButtonOperatorHandler(rp));
        this.add(buttonResultPresenter);

        buttonBackSpace = new Button("BackSpace");
        buttonBackSpace.setBounds(xNumPad(3), yNumPad(4)-(SPACE+2),(2*BW)+SPACE,BH);
        buttonBackSpace.setForeground(Color.blue);
        buttonBackSpace.addActionListener(new ButtonBackSpaceHandler(op));
        this.add(buttonBackSpace);

        buttonClear = new Button("C");
        buttonClear.setBounds(xNumPad(0), yNumPad(4)-(SPACE+2),BW,BH);
        buttonClear.setForeground(Color.blue);
        buttonClear.addActionListener(new ButtonClearHandler(op));
        this.add(buttonClear);

        buttonClearAll = new Button("CE");
        buttonClearAll.setBounds(xNumPad(1), yNumPad(4)-(SPACE+2),BW,BH);
        buttonClearAll.setForeground(Color.blue);
        buttonClearAll.addActionListener(new ButtonClearAllHandler(op));
        this.add(buttonClearAll);


        display = new TextField("0");
        display.setEditable(false);
        display.setBounds(13,55,257,30);
        this.add(display);

        this.setSize(283, 320);
        this.setLocation(40,80);
        this.setVisible(true);
        this.setResizable(false);
        this.addWindowListener(new CloseWindowAndExit());
    }

    public static void warningBoxForStack(EmptyStackException exception)
    {
//        exception.printStackTrace();
        JOptionPane.showMessageDialog(null, "The stack is empty or you entered only one operand"+
                "\n"+"("+exception+")", "Warning", JOptionPane.WARNING_MESSAGE);
    }

    public static void warningBoxForMultiplePoints(NumberFormatException exception)
    {
//        exception.printStackTrace();
        JOptionPane.showMessageDialog(null, "You might have entered more than one subdialect"+
                "\n"+"("+exception+")", "Warning", JOptionPane.WARNING_MESSAGE);
    }

    private int xNumPad(int x) {
        return (20) + x*(BW+SPACE);
    }

    private int yNumPad(int y) {
        return (280) - y*(BH+SPACE);
    }
}
class CloseWindowAndExit extends WindowAdapter {
    public void windowClosing(WindowEvent closeWindowAndExit) {
        System.exit(0);
    }
}
