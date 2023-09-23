package heranca;

public class animal {
    private double peso;
    private String comida;

    public String getComida() {
        return comida;
    }
    public double getPeso() {
        return peso;
    }
    public void setComida(String comida) {
        this.comida = comida;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    void comer(){
        System.out.println("Nhom nhom");
    }
    void dormir(){
        System.out.println("Zzzzzzzz");
    }
}
