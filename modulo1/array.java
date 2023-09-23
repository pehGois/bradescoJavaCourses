import java.util.Arrays;
public class array {
    public static void main (String[] args){
        String[] paises = {"Brasil", "Rússia", "India" ,"China", "South Africa"};
        System.out.println(Arrays.toString(paises));
        int posicao = Arrays.binarySearch(paises, "Brasil");
        System.out.println( paises[posicao]);
        Arrays.sort (paises, 0, paises.length);
        System.out.println(Arrays.toString(paises));
    }
}
