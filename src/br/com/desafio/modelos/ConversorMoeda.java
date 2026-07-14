package br.com.desafio.modelos;

public class ConversorMoeda implements ConversaoFinanceira {
    private double valor;
    private String moeda;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }


    @Override
    public void converterDolarParaReal() {
        double real = 1.00;
        double dolar = 5.00;
        real = this.valor * dolar;
        System.out.println(real);
    }
}
