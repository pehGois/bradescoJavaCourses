package basics;
public class consumidor {
    public static void main( String[] args){
        conta daniel = new conta();
        daniel.setCliente("Daniel");
        daniel.setSaldo(1_000.00);

        conta carlos = new conta();
        carlos.setCliente("Carlos");
        carlos.setSaldo(0);

        daniel.transferencia(500.00, carlos);
        carlos.exibesaldo();
    }
}
