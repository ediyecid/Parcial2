public class Yate  extends Vehiculos{

 private final int pesoMaximo;

    
    public Yate(ConstructorYate yateInfo) {
        super(yateInfo.getReferencia(), yateInfo.getVelocidadMaxima(), yateInfo.getColor());
        this.pesoMaximo = yateInfo.getPesoMaximo();
    }

    public String getReferencia() {
        return this.referencia;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
    public Colores getColor() {
        return this.color;
    }

    @Override
    public AseVehiculos clonar() {
        return new Yate(new ConstructorYate().referencia(this.getReferencia()));
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPeso Maximo: " + this.pesoMaximo + "Kilogramos";
    }
}


// patron BUILDER
class ConstructorYate {
    
    private String referencia;
    private int velocidadMaxima;
    private Colores color;
    private int pesoMaximo;

    public ConstructorYate() {}

    public ConstructorYate referencia(String ref) {
        this.referencia = ref;
        return this;
    }

    public ConstructorYate velocidadMaxima(int velMax) {
        this.velocidadMaxima = velMax;
        return this;
    }

    public ConstructorYate color(Colores color) {
        this.color = color;
        return this;
    }

    public ConstructorYate pesoMaximo(int peso) {
        this.pesoMaximo = peso;
        return this;
    }


    public String getReferencia() {
        return referencia;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public Colores getColor() {
        return color;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }
}