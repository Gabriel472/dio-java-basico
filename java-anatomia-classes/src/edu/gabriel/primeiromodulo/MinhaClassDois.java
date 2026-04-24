package edu.gabriel.primeiromodulo;
public class MinhaClassDois {

    public static void main (String [] args) {
        String primeiroNome = "Gabriel";
        String segundoNome = "Rodrigues";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}