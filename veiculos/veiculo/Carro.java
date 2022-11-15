package veiculo;

public class Carro extends VeiculoModel {
    private int quantidadePortas;

    public Carro(String nome, double combustivel, double consumo, String placa, int quantidadePortas) {
        super(nome, TipoVeiculo.CARRO, combustivel, consumo, placa);
        this.quantidadePortas = quantidadePortas;
    }


    @Override
    public double retornaGastoComCombustivel(double distancia, double valorCombustivel) {
        return 0;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }
}
