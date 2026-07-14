package br.com.desafio.modelos;

public class TabuadaMultiplicacao  implements Tabuada {


    @Override
    public void mostrarTabuada(int numero) {
        int resultado;
        System.out.println("#############################");
        for(int i = 1; i <= 10; i++){
            resultado = i * numero;
            System.out.println(String.format("%d X %d = %d", i, numero, resultado));
        }
        System.out.println("#############################\n");
    }
}
