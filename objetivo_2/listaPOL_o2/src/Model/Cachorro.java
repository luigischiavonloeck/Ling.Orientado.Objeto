package Model;

public class Cachorro extends Animal{
    public Cachorro() {
    }

    public Cachorro(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("Um cachorro foi desenhado");
    }
}
