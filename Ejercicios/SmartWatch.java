package EjercicioTema4;


    public class SmartWatch extends SmartDevice {

        String material = "";

        public SmartWatch() {
        }

        public SmartWatch(int peso, int numerocamaras, int megapixels, String sistemaoperativo, double memoriaram, String material) {
            super(peso, numerocamaras, megapixels, sistemaoperativo, memoriaram);
            this.material = material;

        }
        @Override
        public String toString() {
            return "SmartWatch{" +
                    "peso=" + peso +
                    ", numerocamaras=" + numerocamaras +
                    ", megapixels=" + megapixels +
                    ", sistemaoperativo='" + sistemaoperativo + '\'' +
                    ", memoriaram=" + memoriaram +
                    ", Material=" + material +
                    '}';
        }

        }
