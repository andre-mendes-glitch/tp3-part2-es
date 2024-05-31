public class Triangulo extends FigurasPlanas implements Cloneable{

     private double base;
     private double altura;

     public Triangulo() {
         super.setNome("Triangulo");
     }

    public Triangulo(double base, double altura) {
        super.setNome("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base='" + getBase() + "'" +
                ", altura='" + getAltura() + "'" +
                '}';
    }

    @Override
    public double calcularArea() {
        return (base*altura) / 2;
    }


}
