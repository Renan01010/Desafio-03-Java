import br.com.desafio.modelos.Carro;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setModelo("Mercedes");
        carro.setPrecoAno1(15000);
        carro.setPrecoAno2(23000.00);
        carro.setPrecoAno3(30000.00);

        carro.fichaTecnica();
    }
}
