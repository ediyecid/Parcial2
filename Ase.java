interface AseVehiculos {
    public AseVehiculos clonar();
    public String getReferencia();
}


//  patron FACTORY METHOD
abstract class Vehiculos implements AseVehiculos {

    protected final String referencia;
    protected final Colores color;
    protected final int velocidadMaxima;
    

    public Vehiculos(String referencia, int velocidadMaxima, Colores color) {
        this.referencia = referencia;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }

    public abstract int getVelocidadMaxima();

    public abstract Colores getColor();

    public AseVehiculos clonar() {
        return this; 
    }

    @Override
    public String toString() {
        return "Referencia: " + referencia +
                "\nVelocidad maxima: " + velocidadMaxima + " km/h" +
                "\nColores: " + color;
    }
}


class Tipado {
    
    private String referencia = "";
    private int velocidadMaxima = 0;
    private Colores color = Colores.VERDE;
    private boolean correcto = true;

    public Tipado(boolean valido) {
        this.correcto = valido;
    }

    public Tipado(String Refe, int velocidadMax, Colores color) {
        this.referencia =  Refe;
        this.velocidadMaxima = velocidadMax;
        this.color = color;
    }

    public void setIntegridad(boolean valido) {
        this.correcto = valido;
    }
    public String getReferencia() {
        return referencia;
    }
    public boolean getIntegridad() {
        return correcto;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public Colores getColor() {
        return color;
    }
}