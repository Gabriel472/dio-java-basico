package edu.gabriel.primeiromodulo;

public class JavaDocAulaDoisComentarios {
    public static void main(String[] args) {
        // Comentário One Line
        // Olá, eu sou um comentário em uma única linha

        /* Comentário Multi Line
        * Olá,
        * Eu sou um comentário
        * que posso ser mais detalhado
        * quando necessário
        */
    }

    /** Comentário Documentation
     * Estas duas estrelinhas acima
     * são para identificar que você
     * pretende elaborar um comentário
     * a nível de documentação.
     * Que incrível!!!
     */
    public void metodo(){

    }

    /*
    * Este método foi elaborado as pressas
    * por isso eu abreviei os nomes das variáveis
    * mas olha, ele tem a finalidade somar ou multiplicar
    * dois números
    */
    public int somarMultiplicar(int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M = multiplicação
            r = n * x;
        }else{
            // se não, soma mesmo
            r = n + x;
        }
        return r;
    }
}
