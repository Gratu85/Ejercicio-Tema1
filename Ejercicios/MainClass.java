package EjercicioTema5;

public class MainClass {

     static CocheCrud cochecrud = new CocheCRUDImpl();

    public static void main(String[] args) {

        cochecrud.save();
        cochecrud.delete();
        cochecrud.findall();

    }
}
