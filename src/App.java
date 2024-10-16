import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * instanciamos el tipo de viaje
         * probando cambio desde github
         * @params = pais{string} -solo EU y America, dias{int} -entre 3 y 7 dias, precio{double} -en euros
         */
        Viaje viajeLujo = new Viaje("Japón", 20, 3500); //6.instanciar objeto
        Viaje viajeCasero = new Viaje("Balaguer", 3, 120);
        Viaje viajePlaya = new Viaje("Costa Brava", 8, 700);

        // añadir viaje a al array de viajes
        ArrayList<Viaje> catalogoViajes = new ArrayList<>();
        catalogoViajes.add(viajeLujo);
        catalogoViajes.add(viajeCasero);
        catalogoViajes.add(viajePlaya);
        
        System.out.println(catalogoViajes);

        // mostrar todo el catalogo de viajes
        //for each
        for(Viaje x: catalogoViajes){
            System.out.println(x);
        }

        //for
        for(int i=0; i<catalogoViajes.size(); i++){
            System.out.println(catalogoViajes.get(i));
        }
   
    }
}
