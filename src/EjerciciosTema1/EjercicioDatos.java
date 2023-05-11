package EjerciciosTema1;

public class EjercicioDatos {
    public static void main(String[] args) {

      // Datos primitivos numericos//

        byte numcorto=2;
        short numcortomedio=4;
        int numnormal=3;
        long numlargo=6;

        //Datos primitivos boolean//

         boolean verdadero=true;
         boolean falso=false;

         //Datos String//

        char letra='a';
        String nombre="Ivan";     //String no es dato primitivo es clase//

        System.out.println(numcorto+" "+numcortomedio+" "+numnormal+" "+numlargo);
        System.out.print(verdadero+" y ");
        System.out.println(falso);
        System.out.println(nombre+"   "+letra);
    }
}
