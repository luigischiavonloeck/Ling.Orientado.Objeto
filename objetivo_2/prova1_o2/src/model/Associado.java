package model;

public interface Associado {
    double lucros(int qdeCotas, double valorCota);

    void setQdeCotas(int qdeCota);

    int getQdeCotas();

    void setValorCota(double valor);

    double getValorCota();
}
