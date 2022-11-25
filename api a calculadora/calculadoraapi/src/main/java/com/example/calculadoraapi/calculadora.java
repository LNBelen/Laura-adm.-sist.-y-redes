package com.example.calculadoraapi;

public class calculadora {
    int a;
    int b;

    public int sumar(int a,int b){
        int res = a + b;
        return res;
    }
    public int restar(int a,int b){
        int res = a - b;
        return res;
    }
    public int multiplicar(int a,int b){
        int res = a * b;
        return res;
    }


    public int dividir(int a,int b){
        int res = a / b;
        return res;

    }

    public float cuadratica1(float a, float b, float c) {
        float raiz = (float) Math.sqrt(b * b - 4 * a * c);
        float raizA = (((-b) + raiz) / (2 * a));
        float raizB = (((-b) - raiz) / (2 * a));

        float resultado1 = raizA;
        return resultado1;
    }
    public float cuadratica2(float a, float b, float c) {
        float raiz = (float) Math.sqrt(b * b - 4 * a * c);
        float raizA = (((-b) + raiz) / (2 * a));
        float raizB = (((-b) - raiz) / (2 * a));

        float resultado2 = raizB;
        return resultado2;
    }
}

