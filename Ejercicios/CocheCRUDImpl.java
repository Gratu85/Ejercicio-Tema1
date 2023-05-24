package EjercicioTema5;

import Classes1.Coche;

import java.util.List;

public class CocheCRUDImpl implements CocheCrud {
    @Override
    public void save() {

        System.out.println("save") ;   }

    @Override
    public void delete() {
        System.out.println("delete") ;
    }

    @Override
    public List<Coche> findall() {
        System.out.println("findall") ;

        return null;
    }
}
