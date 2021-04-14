package PyFigura;

import java.util.ArrayList;
import java.util.spi.AbstractResourceBundleProvider;

public class Principal {
    public static void main(String[] args) {
        Circulo c1 = new Circulo("circulo",5);
        Rectangulo r1 = new Rectangulo("Rect 1",2,3);
        Cuadrado cu1 = new Cuadrado("Cuad 1",2);

        // Arreglo de figuras
        Figura[] arreglo = new Figura[6];
        arreglo[0] = new Circulo("Circulo 2", 30);
        arreglo[1] = new Cuadrado("Cuadrado", 5);
        arreglo[2] = new Rectangulo("Rectángulo",2,3);
        arreglo[3] = c1;
        // arreglo[4] = r1;
        // arreglo[5] = cu1;

        //System.out.println("Figura posición 3: " + arreglo[2]);

        /*colorear(c1, "Rojo");
        colorear(r1, "Amarillo");
        colorear(cu1, "Anaranjado");*/

        System.out.println("Total area: " + (int)totalArea(arreglo));

        ArrayList<Figura> v1 = new ArrayList<Figura>();
        v1.add(new Circulo("c6",30));
        v1.add(new Rectangulo("r3", 3,4));
        v1.add(arreglo[1]);

        // Casteo
        Circulo f2 = (Circulo) v1.get(0);

        mostrar(v1);
    }

    public static void colorear(Figura f, String color){
        f.pintar(color);
    }
    public static double totalArea(Figura[] arr) {
        double suma = 0;
        for (Figura i: arr) {
            if(i != null){
                suma += i.area();
            }
        }
        return suma;
    }

    public static void mostrar(ArrayList<Figura> arrL){
        for (Figura i: arrL) {
            System.out.println("Figura: " + i);
        }
    }
}
