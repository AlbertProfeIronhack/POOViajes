
public class Viaje {
    
    private String pais;
    private int dias;
    private double precio;

    /**
     * funcion constructora del objeto
     * @param pais {String}
     * @param dias {int}
     * @param precio {double}
     * @return una instancia del objeto {Viaje}
     */
    public Viaje(String pais, int dias, double precio) {
        this.pais = pais; 
        this.dias = dias;
        this.precio = precio;
    }

    
    // GETTERS ---
    /**
     * Lee el pais de ese viaje
     * @return {String} - el pais
     */
    public String getPais() {
        return this.pais; // devuelve el que encuentra aquí
    }

    public int getDias() {
        return this.dias;
    }

    public double getPrecio() {
        return this.precio;
    }

    //SETTERS ---
    public void setPais(String pais){
        this.pais = pais; //sobreescribe el que había
    }

    public void setDias(int dias){
        this.dias = dias;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    /**
     * to string personalizado
     * @return {string} pais dias y precio
     */
    @Override
    public String toString(){
        return "la destinacion es: " + getPais() + ", la cantidad de días es de " + getDias()
        + " y vale " + getPrecio() + " euros";
    }

}
