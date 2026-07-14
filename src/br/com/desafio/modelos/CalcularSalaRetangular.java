package br.com.desafio.modelos;

public class CalcularSalaRetangular implements CalculoGeometrico{
    private double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }


    @Override
    public double calcularArea() {
       double area = this.altura * this.largura;
        System.out.println("Area é: " + area);
        return  area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (this.largura + this.altura) * 2;
        System.out.println("Perimetro é: "+ perimetro);
        return perimetro;
    }
}
