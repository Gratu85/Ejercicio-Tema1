package EjercicioTema4;

public class SmartPhone extends SmartDevice {

    boolean resistenteagua = true;

    public SmartPhone() {
    }

    public SmartPhone(int peso, int numerocamaras, int megapixels, String sistemaoperativo, double memoriaram, boolean resistenteagua) {
        super(peso, numerocamaras, megapixels, sistemaoperativo, memoriaram);
        this.resistenteagua = resistenteagua;

    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "peso=" + peso +
                ", numerocamaras=" + numerocamaras +
                ", megapixels=" + megapixels +
                ", sistemaoperativo='" + sistemaoperativo + '\'' +
                ", memoriaram=" + memoriaram +
                ", resistentagua=" + resistenteagua +
                '}';
    }
}