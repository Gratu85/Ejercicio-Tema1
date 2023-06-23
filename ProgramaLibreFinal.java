package ProgramaLibre;

import java.io.*;
import java.util.*;

public class ProgramaLibreFinal {


    public static void main(String[] args) throws IOException {


        //Programa compras  del banco wix//

        HashMap<String, Integer> compras = new HashMap<>(15);

        compras.put("Supermercado", 1);
        compras.put("Gasolina", 2);
        compras.put("Cafeteria", 3);
        compras.put("Alquiler", 4);
        compras.put("Optica", 5);
        compras.put("Impresora", 6);
        compras.put("Reparación", 7);
        compras.put("asolina", 8);
        compras.put("afeteria", 9);
        compras.put("lquiler", 10);
        compras.put("ptica", 11);
        compras.put("Ipresora", 12);
        compras.put("Spermercado", 13);
        compras.put("Gaolina", 14);
        compras.put("Caeteria", 15);
        compras.put("Aluiler", 16);


        //Leer bytes del archivo//

        String cadena=compras.toString();
        String arxivobanco="Extracto bancario";

        //Leer bytes y mostrarlos//


            //Crea copia de las compras//
            OutputStream out = new FileOutputStream(arxivobanco);
            out.write(cadena.getBytes());
            System.out.println("Ahora tienes un archivo guardado con tus extractos");
            out.close();


       ArrayList<Map.Entry<String, Integer>> arraylist = new ArrayList<>(compras.entrySet());


        //Valores ordenados//

        Collections.sort(arraylist, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return 0;
            }
        });


        for (Map.Entry<String, Integer> entry : arraylist) {
            String key = entry.getKey();                         //Per treure valors imprimits baixar Classe Map.Entry
            //ultilitzar metodes getkey i get value
            int value = entry.getValue();

            System.out.println("la clave es " + key + " el valor es  " + value);
        }

        if (compras.size() > 15) {
            System.out.println("Genial has conseguido un 15% de descuento en tus proxima compra por haber comprado" +
                    " 15 veces , enhorabuena!");
        }
        if (compras.containsKey("Reparación")) {
            System.out.println("Pase por nuestra oficina y le haremos un 5% de abono en su proxima reparación ");

        }

        // Ordenar la lista en base a las claves
        Collections.sort(arraylist, Comparator.comparing(Map.Entry::getValue));

        // Mostrar el contingut ordenat//
        for (Map.Entry<String, Integer> entry : arraylist) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Clave: " + key + ", Valor: " + value);
        }
    }
}




















  /*
                */