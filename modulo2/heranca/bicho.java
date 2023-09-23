package heranca;
public class bicho {
    public static void main (String[] args){
        cachorro alfredo = new cachorro();
        alfredo.setPeso(25);
        alfredo.setComida("Ração");
        alfredo.latir();

        galinha juquinha = new galinha();
        juquinha.setPeso(15);
        juquinha.voar();
        juquinha.ciscar();
    }
}
