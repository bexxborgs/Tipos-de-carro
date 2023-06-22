import java.util.ArrayList;
import java.util.List;

public class ListaCarros {

    class Toyota extends Carro {
        public Toyota(String modelo) {
            super("Toyota", modelo);
        }
    }

    class GM extends Carro {
        public GM(String modelo) {
            super("GM", modelo);
        }
        class Honda extends Carro {
            public Honda(String modelo) {
                super("Honda", modelo);

                ArrayList<Object> listaCarros = new ArrayList<Object>();

                Toyota toyotaCorolla = new Toyota("Corolla");
                listaCarros.add(toyotaCorolla);

                GM gmCamaro = new GM("Camaro");
                listaCarros.add(gmCamaro);

                Honda hondaCivic = new Honda("Civic");
                listaCarros.add(hondaCivic);

                for (Object carro : listaCarros) {
                    System.out.println("Marca: " + Carro.getMarca() + ", Modelo: " + Carro.getMarca());


                }
            }
        }
    }
}
