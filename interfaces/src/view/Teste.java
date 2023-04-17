package view;

import model.AreaCalculavel;
import model.Quadrado;
import model.Retangulo;
import model.Circulo;

public class Teste {
    public static void main(String[] args) {
        AreaCalculavel a1 = new Retangulo(3, 2);
        System.out.println("Área do Retângulo: " + a1.calculaArea());

        AreaCalculavel a2 = new Quadrado(4);
        System.out.println("Área do Quadrado: " + a2.calculaArea());

        AreaCalculavel a3 = new Circulo(5);
        System.out.println("Área do Círculo: " + a3.calculaArea());
    }
}
