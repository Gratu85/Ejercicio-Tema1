package Ejercicio789;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Ejercicios789 {

    static String texto = "Hola mundo";


    public static String reverse(String texto) {
        String invertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }
        return invertida;
    }

    public static Void damearray() {
        String[] ArrayStrings = {"Joana", "Joao Cassio", "Enric", "Pedro", "Sandra", "Tania"};

        for (String Nombres : ArrayStrings) {

            System.out.println(Nombres);  //Salida de  Array de Strings //

        }
        return null;
    }

    public static int damearraybi() {
        int[][] Arraynumeros = new int[3][3];    //Excercicio Array bidimensional//
        Arraynumeros[0][0] = 3;
        Arraynumeros[0][1] = 2;
        Arraynumeros[0][2] = 4;
        Arraynumeros[1][0] = 10;
        Arraynumeros[1][1] = 9;
        Arraynumeros[1][2] = 22;
        Arraynumeros[2][0] = 321;
        Arraynumeros[2][1] = 13;
        Arraynumeros[2][2] = 24;

        for (int i = 0; i < Arraynumeros.length; i++) {

            for (int j = 0; j < Arraynumeros[1].length; j++) {

                System.out.println("  fila  " + i + " columna   " + j);
                System.out.println("  numero " + Arraynumeros[i][j]);

            }
        }

        return 0;
    }

    public static void damenumerosvector() {
        Vector<Integer> guardanumeros = new Vector<Integer>(20, 10); //Ejercicio Vector//
        guardanumeros.add(5);
        guardanumeros.add(51);
        guardanumeros.add(22);
        guardanumeros.add(20);
        guardanumeros.add(88);
        guardanumeros.remove(1);
        guardanumeros.remove(2);


        System.out.println("Los numeros del vector son" + guardanumeros);


    }


    public static int divideporcero(int valor1) throws ArithmeticException {   //Funcion divide por 0//

        return valor1 / 0;

    }

    static String filein = "Archivonovo";
    static String fileout = "Archivonovo2";

    public static String copiafichero(String filein, String fileout) {  //Funcion copiafichero//

        //   String nombrearchivo="texto.txt";//        Nombre de archivo
        //  String contenido="Dentro del arhcivo";//        Contenido dentro archivo

        //File archivo =new File(nombrearchivo);//Crear Archivo


        try{
            String contenidofile="contenido de dentro";
            File archivonovo = new File(filein);
            InputStream in = new FileInputStream(archivonovo);
            byte[] datos = contenidofile.getBytes();

            for (byte bytearray : datos) {
                char array=(char)bytearray;
                System.out.print(array);
            }

            File archivo2 = new File(fileout);
            OutputStream out = new FileOutputStream(archivo2);
            // out.write(contenido.getBytes()); per escriure contingut de variable  dins de fitxer//
            out.write(contenidofile.getBytes());
            out.close();

        } catch (java.io.IOException b) {                  //Excepción try...//
            System.out.println("Esta mal" + b.getMessage());

        } finally {
            System.out.println("Prueba Demo");
        }
        return "Fichero  copiado  y nuevo creado";

    }

    public static void main(String[] args) {


        reverse(texto);
        damearray();
        damearraybi();
        damenumerosvector();
        copiafichero(filein, fileout);


        //Ejercicio pregunta vector//
        /*El problema de un vector con 1000 elementos por defecto es que en principio es de bastante capacidad para llenar
         ocupando mucho en memoria y habria que ajustarse  a la realidad en pequeños  o mas grandes tramos para que pudiera aumentar el vector
         //poco a poco, en  todo caso el problema real es cuando se sobrepasan los 1000 elementos
        entonces se va a crear otro vector de 1000 y este  junto con el otro ocuparia  mucho espacio dentro un pc porque
        en el vector la capacidad siempre aumenta el doble */


        ArrayList<String> ciudades = new ArrayList<String>(); //Ejercicio ArrayList con 4 elementos i LinkedList//
        ciudades.add("Igualada");
        ciudades.add("Madrid");
        ciudades.add("Girona");
        ciudades.add("Cadiz");

        LinkedList<String> ciudades2 = new LinkedList<String>(ciudades); //Incluimos objeto ArrayList en LinkedList//

        System.out.println("ciudades de ArrayLlist " + ciudades);
        System.out.println("ciudades de LinkedList " + ciudades2);

        ArrayList<Integer> numeros = new ArrayList<Integer>();


        //Ejercicio Array suma dinamico//
        //Introducir numero de memorias//

        int memorias = 10;
        int i = 0;

        do {
            i++;
            numeros.add(i);

        }

        while (numeros.size() < memorias);
        {

            System.out.println("El numero de memories introduit  son " + numeros.size());

            for (int j= numeros.size()-1;j>0; j -- ) {

                System.out.println(" memoria numero " + numeros.get(j));

            }
            System.out.println("El arrayList contiene " + numeros + " elementos");



            try {
                int valor0 = divideporcero(0);
                System.out.println(valor0);
            } catch (ArithmeticException b) {
                System.out.println("Esto no puede hacerse error " + b.getMessage());
            } finally {
                System.out.println("Prueba demo");
                {


                }
            }
        }
    }
}
