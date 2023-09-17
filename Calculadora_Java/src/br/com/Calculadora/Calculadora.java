package br.com.Calculadora;

import java.util.HashMap;

public class Calculadora {
    private HashMap<Integer, Double> resultados;

    public Calculadora() {
        resultados = new HashMap<>();
    }

    public synchronized void calcularRaizQuadrada(int numero) {
        double raiz = Math.sqrt(numero);
        resultados.put(numero, raiz);
        System.out.println("Raiz quadrada de " + numero + " = " + raiz);
    }

    public HashMap<Integer, Double> getResultados() {
        return resultados;
    }
}
