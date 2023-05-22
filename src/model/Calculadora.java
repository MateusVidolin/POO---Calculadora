package model;

public class Calculadora {
    private double operando1;
    private double operando2;
    private char sinal;
    private double resultado;

    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    public char getSinal() {
        return sinal;
    }

    public void setSinal(char sinal) {
        this.sinal = sinal;
    }

    public double getResultado() {
        switch (sinal){
            case '+':
                resultado = operando1 + operando2;
                break;
            case '-':
                resultado = operando1 - operando2;
                break;
            case '*':
                resultado = operando1 * operando2;
                break;
            case '/':
                resultado = operando1 / operando2;
                break;
        }

        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
