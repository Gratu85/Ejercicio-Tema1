package GratovilCompany;

public class Classeifelse {
    public static void main(String[] args) {

        boolean  check =5<10;
        int n1=8;
        int n2=7;
        int n3=6;

        if (n1<n2&&n2<n3) {
            System.out.println("Es verdadero");
        } else if (n1>n2&&n2>n3){
            System.out.println("Es verdadero tambien");

        } else{
            System.out.println("Es falso");
        }
        System.out.println("Acabo el programa");
    }
}
