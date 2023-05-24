package EjercicioTema4;


public class SmartDevice {


    int peso = 0;
    int numerocamaras = 0;
    int megapixels = 0;
    String sistemaoperativo = "";
    Double memoriaram = 3.4;


    public SmartDevice() {

    }

    public SmartDevice(int peso, int numerocamaras, int megapixels, String sistemaoperativo, Double memoriaram) {
        this.peso = peso;
        this.numerocamaras = numerocamaras;
        this.megapixels = megapixels;
        this.sistemaoperativo = sistemaoperativo;
        this.memoriaram = memoriaram;
    }

    public void mostrarmensaje(){
        System.out.println("Esto es classe herencia");
    }
    @Override
    public String toString() {
        return "SmartDevice{" +
                "peso=" + peso +
                ", numerocamaras=" + numerocamaras +
                ", megapixels=" + megapixels +
                ", sistemaoperativo='" + sistemaoperativo + '\'' +
                ", memoriaram=" + memoriaram +
                '}';
    }

    public static void main(String[] args) {
        SmartPhone Iphone14= new SmartPhone(234,3,485,"IOS",256.0,  true);
        SmartWatch Titanium = new SmartWatch(50,1,245,"IOS",256,"Titanio");
        SmartDevice prototipo=new SmartDevice(550,4,600,"android",256.0);
        System.out.println(prototipo.toString());
        System.out.println(Iphone14.toString());
        System.out.println(Titanium.toString());


    }
}







