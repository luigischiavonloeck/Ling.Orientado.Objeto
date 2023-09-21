package Model;

public class Peixe extends Animal{
    private double z;

    public Peixe() {
    }

    public Peixe(double x, double y) {
        super(x, y);
    }

    public Peixe(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void mover(double x, double y, double z) {
        super.mover(x, y);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.printf("\nUm peixe foi desenhado em X: %.2f, Y: %.2f, Z: %.2f",x,y,z);
    }

    @Override
    public String toString() {
        return "\nPeixe "+super.toString() + ", z= " + z;
    }
}
