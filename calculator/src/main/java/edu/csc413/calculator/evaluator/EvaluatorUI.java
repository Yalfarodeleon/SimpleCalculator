package edu.csc413.calculator.evaluator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvaluatorUI extends JFrame implements ActionListener {

    private JTextField expressionTextField = new JTextField();
    private JPanel buttonPanel = new JPanel();

    // total of 20 buttons on the calculator,
    // numbered from left to right, top to bottom
    // bText[] array contains the text for corresponding buttons
    private static final String[] buttonText = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "(", "0", ")", "/",
            "C", "CE", "=", "^"
    };

    /**
     * C  is for clear, clears entire expression
     * CE is for clear expression, clears last entry up until the last operator.
     */
    private JButton[] buttons = new JButton[buttonText.length];

    public static void main(String argv[]) {
        new EvaluatorUI();
    }

    public EvaluatorUI() {
        setLayout(new BorderLayout());
        this.expressionTextField.setPreferredSize(new Dimension(600, 50));
        this.expressionTextField.setFont(new Font("Courier", Font.BOLD, 24));
        this.expressionTextField.setHorizontalAlignment(JTextField.CENTER);

        add(expressionTextField, BorderLayout.NORTH);
        expressionTextField.setEditable(false);

        add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.setLayout(new GridLayout(5, 4));

        //create 20 buttons with corresponding text in bText[] array
        JButton tempButtonReference;
        for (int i = 0; i < EvaluatorUI.buttonText.length; i++) {
            tempButtonReference = new JButton(buttonText[i]);
            tempButtonReference.setFont(new Font("Courier", Font.BOLD, 24));
            buttons[i] = tempButtonReference;
        }

        //add buttons to button panel
        for (int i = 0; i < EvaluatorUI.buttonText.length; i++) {
            buttonPanel.add(buttons[i]);
        }

        //set up buttons to listen for mouse input
        for (int i = 0; i < EvaluatorUI.buttonText.length; i++) {
            buttons[i].addActionListener(this);
        }

        setTitle("Calculator");
        setSize(400, 400);
        setLocationByPlatform(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * This function is triggered anytime a button is pressed
     * on our Calculator GUI.
     *
     * @param actionEventObject Event object generated when a
     *                          button is pressed.
     */
        private Boolean emptyOutput = false;

    public void actionPerformed(ActionEvent actionEventObject) {
        //System.out.println(actionEventObject);
        String command = actionEventObject.getActionCommand();
        if(emptyOutput){
            expressionTextField.setText("");
            emptyOutput = false;
        }

        if("9".equals(actionEventObject.getActionCommand())){
            this.expressionTextField.setText(this.expressionTextField.getText()+command);
        }
        if("8".equals(actionEventObject.getActionCommand())){
            this.expressionTextField.setText(this.expressionTextField.getText()+command);
        }
        if("7".equals(actionEventObject.getActionCommand())){
            this.expressionTextField.setText(this.expressionTextField.getText()+command);
        }
        if("6".equals(actionEventObject.getActionCommand())){
            this.expressionTextField.setText(this.expressionTextField.getText()+command);
        }
        if("5".equals(actionEventObject.getActionCommand())){
            this.expressionTextField.setText(this.expressionTextField.getText()+command);
        }
        if("4".equals(actionEventObject.getActionCommand())){
            this.expressionTextField.setText(this.expressionTextField.getText()+command);
        }
        if("3".equals(actionEventObject.getActionCommand())){
            this.expressionTextField.setText(this.expressionTextField.getText()+command);
        }
        if("2".equals(actionEventObject.getActionCommand())){
            this.expressionTextField.setText(this.expressionTextField.getText()+command);
        }
        if("1".equals(actionEventObject.getActionCommand())){
            this.expressionTextField.setText(this.expressionTextField.getText()+command);
        }
        if("0".equals(actionEventObject.getActionCommand())){
            this.expressionTextField.setText(this.expressionTextField.getText()+command);
        }

        if(actionEventObject.getActionCommand() == "C"){
            expressionTextField.setText("");
        }

        /*else if(actionEventObject.getActionCommand() == "CE"){

        }*/

        /*else if(actionEventObject.getActionCommand() == "="){

        }*/

        else{
            expressionTextField.setText(expressionTextField.getText() + actionEventObject.getActionCommand());
        }
    }
}
