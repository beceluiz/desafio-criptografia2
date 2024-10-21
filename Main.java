import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        faça uma função que criptografe um texto, recebendo um texto e retornando
//        a criptografia em  numeros do texto fornecido
//        de acordo com o alfabeto, exemplo : mamaco = 131131315

        System.out.println(cripto("mamaco"));
    }

    public static String cripto(String texto) {
        char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] numeros;
        String criptografia = "";
        numeros = new int[alfabeto.length];

        for(int i =0; i < alfabeto.length; i++){
            numeros[i] = i +1;
        }

        for(int i = 0; i < texto.length(); i++){
            for(int j = 0; j < alfabeto.length; j++){
                if(texto.charAt(i) == alfabeto[j]) {
                    criptografia += numeros[j];
                }
            }
        }

        return criptografia;
    }
}
