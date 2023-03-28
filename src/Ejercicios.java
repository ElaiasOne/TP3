import java.util.Arrays;
public class Ejercicios {

    public static void main(String[] args) {
        Ejercicios ejercicios = new Ejercicios();
        ejercicios.ejercicioA();
        ejercicios.ejercicioB();
        ejercicios.ejercicioC();
        ejercicios.ejercicioD();
        ejercicios.ejercicioE();
    }

    public void ejercicioA() {
        int[] numeros = new int[15];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        System.out.println("Ejercicio A: " + Arrays.toString(numeros));
    }

    public void ejercicioB() {
        int[] numeros = new int[15];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1 + 5;
        }
        System.out.println("Ejercicio B: " + Arrays.toString(numeros));
    }

    public void ejercicioC() {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            if (i == 6) {
                numeros[i] = numeros[i - 1] / 3;
            } else {
                numeros[i] = i + 1;
            }
        }
        System.out.println("Ejercicio C: " + Arrays.toString(numeros));
    }

    public void ejercicioD() {
        String[] productos = {"Zapatillas", "Pelota", "Raqueta", "Guantes"};
        double[] precios = {59.99, 19.99, 29.99, 14.99};
        System.out.println("Ejercicio D:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precios[i]);
        }
    }

    public void ejercicioE() {
        String[] cursos = {"Matemáticas", "Ciencias", "Historia"};
        int[][] notas = {{80, 85, 90}, {75, 70, 80}, {90, 85, 95}};
        double promedio = 0;
        System.out.println("Ejercicio E:");
        for (int i = 0; i < cursos.length; i++) {
            int sumaNotas = 0;
            for (int j = 0; j < notas[i].length; j++) {
                sumaNotas += notas[i][j];
            }
            promedio = (double) sumaNotas / notas[i].length;
            System.out.println(cursos[i] + ": " + promedio);
        }
    }
}
