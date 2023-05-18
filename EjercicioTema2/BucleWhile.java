public class BucleWhile {
    public static void main(String[] args) {

        String[] Nombres = {"Oriol", "Francesc", "Antonio", "Raquel", "Joana"};

        int contador=0;

        while (contador<Nombres.length) {
            for (String nombre : Nombres) {
                String cadena = " , ";
                System.out.printf(nombre);
                System.out.printf(cadena);
                contador++;

            }

        }
    }
}


