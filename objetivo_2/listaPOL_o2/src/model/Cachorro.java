package model;

public class Cachorro extends Animal{
    public Cachorro() {
    }

    public Cachorro(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.printf("\nUm cachorro foi desenhado em X: %.2f, Y: %.2f",x,y);
    }

    @Override
    public String toString() {
        return "\nCachorro "+super.toString();
    }
}
