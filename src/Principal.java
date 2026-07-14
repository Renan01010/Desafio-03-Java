import br.com.desafio.modelos.Cachorro;
import br.com.desafio.modelos.Carro;
import br.com.desafio.modelos.ConversorMoeda;
import br.com.desafio.modelos.Gato;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setModelo("Mercedes");
        carro.setPrecoAno1(15000);
        carro.setPrecoAno2(23000.00);
        carro.setPrecoAno3(30000.00);

        carro.fichaTecnica();

        Gato gato = new Gato();

        gato.setNome("Alex");
        gato.setIdade(8);
        gato.emitirSom();
        gato.arranharMoveis();

        Cachorro cachorro = new Cachorro();

        cachorro.setNome("Jorge");
        cachorro.setIdade(12);

        cachorro.abanarRabo();
        cachorro.emitirSom();

        ConversorMoeda dolar = new ConversorMoeda();
        dolar.setMoeda("Dolar");
        dolar.setValor(50.00);
        dolar.converterDolarParaReal();


    }
}
