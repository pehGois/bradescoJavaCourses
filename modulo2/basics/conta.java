package basics;
public class conta {
    private String cliente;
    private double saldo;
    void setSaldo(double valor){
        this.saldo = valor;
    }
    double getSaldo(){
        return this.saldo;
    }
    void setCliente(String cliente){
        this.cliente = cliente;
    }
    String getCliente(){
        return this.cliente;
    }
    void exibesaldo(){
        System.out.println(this.cliente + ", seu saldo é: " + this.saldo);
    }
    boolean saque(double valor){
        if (saldo > valor){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
            return true;
        }
        else System.out.println("Valor em conta indisponível");
        return false;
    }
    void deposito(double valor){
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso");
    }
    void transferencia(double valor, conta destino){
        if (this.saque(valor)){
            destino.deposito(valor);
            System.out.println("Transferência realizada com sucesso");
        }
        else System.out.println("Saldo insuficiente");
    }
}
