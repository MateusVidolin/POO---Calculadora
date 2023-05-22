package view;

import model.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CalculadoraView extends JFrame implements WindowListener, ActionListener {
    protected Dimension dButton, dTextField, dFrame, dButtonEqual, dButtonOperation;
    protected TextField txtVisor;
    protected Button btn0;
    protected Button btn1;
    protected Button btn2;
    protected Button btn3;
    protected Button btn4;
    protected Button btn5;
    protected Button btn6;
    protected Button btn7;
    protected Button btn8;
    protected Button btn9;
    protected Button btnDecimal;
    protected Button btnSoma, btnSubtrair;
    protected Button btnMultiplica, btnDividir;
    protected Button btnIgual;
    protected Button btnClear;

    private Calculadora calculadora = new Calculadora();

    public CalculadoraView(){
        //define a aparencia e o comportamento da janela
        dFrame = new Dimension(325,300);
        dTextField = new Dimension(302, 50);
        dButton = new Dimension(70, 50);
        dButtonEqual = new Dimension(90, 100);
        dButtonOperation = new Dimension(45, 50);
        this.setTitle("Calculadora");
        this.setSize(dFrame);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        //botões
        btn0 = new Button("0");
        btn0.setSize(dButton);
        btn0.setLocation(72, 209);
        btn0.addActionListener(this);
        this.add(btn0);

        btn1 = new Button("1");
        btn1.setSize(dButton);
        btn1.setLocation(1, 158);
        btn1.addActionListener(this);
        this.add(btn1);

        btn2 = new Button("2");
        btn2.setSize(dButton);
        btn2.setLocation(72, 158);
        btn2.addActionListener(this);
        this.add(btn2);

        btn3 = new Button("3");
        btn3.setSize(dButton);
        btn3.setLocation(143, 158);
        btn3.addActionListener(this);
        this.add(btn3);

        btn4 = new Button("4");
        btn4.setSize(dButton);
        btn4.setLocation(1, 107);
        btn4.addActionListener(this);
        this.add(btn4);

        btn5 = new Button("5");
        btn5.setSize(dButton);
        btn5.setLocation(72, 107);
        btn5.addActionListener(this);
        this.add(btn5);

        btn6 = new Button("6");
        btn6.setSize(dButton);
        btn6.setLocation(143, 107);
        btn6.addActionListener(this);
        this.add(btn6);

        btn7 = new Button("7");
        btn7.setSize(dButton);
        btn7.setLocation(1, 56);
        btn7.addActionListener(this);
        this.add(btn7);

        btn8 = new Button("8");
        btn8.setSize(dButton);
        btn8.setLocation(72, 56);
        btn8.addActionListener(this);
        this.add(btn8);

        btn9 = new Button("9");
        btn9.setSize(dButton);
        btn9.setLocation(143, 56);
        btn9.addActionListener(this);
        this.add(btn9);

        btnDecimal = new Button(",");
        btnDecimal.setSize(dButton);
        btnDecimal.setLocation(143, 209);
        btnDecimal.addActionListener(this);
        this.add(btnDecimal);

        btnClear = new Button("C");
        btnClear.setSize(dButton);
        btnClear.setLocation(1, 209);
        btnClear.addActionListener(this);
        this.add(btnClear);

        btnIgual = new Button("=");
        btnIgual.setSize(dButtonEqual);
        btnIgual.setLocation(214, 159);
        btnIgual.addActionListener(this);
        this.add(btnIgual);

        btnSoma = new Button("+");
        btnSoma.setSize(dButtonOperation);
        btnSoma.setLocation(214, 107);
        btnSoma.addActionListener(this);
        this.add(btnSoma);

        btnSubtrair = new Button("-");
        btnSubtrair.setSize(dButtonOperation);
        btnSubtrair.setLocation(260, 107);
        btnSubtrair.addActionListener(this);
        this.add(btnSubtrair);

        btnMultiplica = new Button("x");
        btnMultiplica.setSize(dButtonOperation);
        btnMultiplica.setLocation(214, 56);
        btnMultiplica.addActionListener(this);
        this.add(btnMultiplica);

        btnDividir = new Button("/");
        btnDividir.setSize(dButtonOperation);
        btnDividir.setLocation(260, 56);
        btnDividir.addActionListener(this);
        this.add(btnDividir);

        txtVisor = new TextField(null);
        txtVisor.setSize(dTextField);
        txtVisor.setLocation(2, 5);
        this.add(txtVisor);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(btn0)){
            int valor = 0;
            valor = Integer.parseInt(0 + "" + valor);
            txtVisor.setText(txtVisor.getText().concat("0"));
        } else if (source.equals(btn1)) {
            txtVisor.setText(txtVisor.getText().concat("1"));
        }else if (source.equals(btn2)) {
            txtVisor.setText(txtVisor.getText().concat("2"));
        }else if (source.equals(btn3)) {
            txtVisor.setText(txtVisor.getText().concat("3"));
        }else if (source.equals(btn4)) {
            txtVisor.setText(txtVisor.getText().concat("4"));
        }else if (source.equals(btn5)) {
            txtVisor.setText(txtVisor.getText().concat("5"));
        }else if (source.equals(btn6)) {
            txtVisor.setText(txtVisor.getText().concat("6"));
        }else if (source.equals(btn7)) {
            txtVisor.setText(txtVisor.getText().concat("7"));
        }else if (source.equals(btn8)) {
            txtVisor.setText(txtVisor.getText().concat("8"));
        }else if (source.equals(btn9)) {
            txtVisor.setText(txtVisor.getText().concat("9"));
        }else if (source.equals(btnSoma)) {
            calculadora.setOperando1(Double.parseDouble(txtVisor.getText()));
            calculadora.setSinal('+');
            txtVisor.setText(null);
        } else if (source.equals(btnSubtrair)) {
            calculadora.setOperando1(Double.parseDouble(txtVisor.getText()));
            calculadora.setSinal('-');
            txtVisor.setText(null);
        }else if (source.equals(btnDividir)) {
            calculadora.setOperando1(Double.parseDouble(txtVisor.getText()));
            calculadora.setSinal('/');
            txtVisor.setText(null);
        }else if (source.equals(btnMultiplica)) {
            calculadora.setOperando1(Double.parseDouble(txtVisor.getText()));
            calculadora.setSinal('*');
            txtVisor.setText(null);
        }else if (source.equals(btnIgual)) {
            calculadora.setOperando2(Double.parseDouble(txtVisor.getText()));
            txtVisor.setText(null);
            txtVisor.setText(String.valueOf(calculadora.getResultado()));
        }else if (source.equals(btnDecimal)) {
            txtVisor.setText(txtVisor.getText().concat("."));
        }else if (source.equals(btnClear)) {
            txtVisor.setText(null);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
