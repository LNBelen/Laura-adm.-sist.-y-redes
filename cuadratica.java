package cuadratica;

public class cuadratica{

    public float [] resolvente(float a, float b, float c) {
        float raiz = (float) Math.sqrt(b * b - 4 * a * c);
            float raizA = (((-b) + raiz) / (2 * a));
            float raizB = (((-b) - raiz) / (2 * a));
            float[] resultado = new float[2];
            resultado[1] = raizA;
            resultado[2] = raizB;
            return resultado;
        }


    }
