public abstract class Forma {
    protected double lato;
    protected double altezza;
    protected double base;

    protected Tipo tipo;

    public Forma(double lato,double altezza, double base, Tipo tipo){

        this.lato = lato;
        this.altezza = altezza;
        this.base = base;
        this.tipo = tipo;
    }
    public Forma(double altezza, double base,Tipo tipo){

        this.altezza = altezza;
        this.base = base;
        this.tipo = tipo;
    }

    public double getArea(){
        return this.altezza * this.base;
    }
}
