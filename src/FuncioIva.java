public class FuncioIva {
    public static void main(String[] args) {


       double precio= precioconiva(5400);
        System.out.println("El precio con el 21% de iva es " +precio+ " euros.");

    }
    public static double precioconiva(double precio){
        double iva=precio * 21 /100;
        double precioconiva=precio+iva;
        return precioconiva;

    }
}
