package Model;

public class Passaro extends Animal{

    private double z;

    public Passaro() {
    }

    public Passaro(double x, double y) {
        super(x, y);
    }

    public Passaro(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void mover(double x, double y, double z){
        System.out.printf("Animal movido para X: %.2f, Y: %.2f, Z: %.2f",x,y,z);
    }

    @Override
    public void desenhar() {
        System.out.println("Um passaro foi desenhado");
    }

    @Override
    public String toString() {
        return super.toString() + ", z= " + z;
    }
}
