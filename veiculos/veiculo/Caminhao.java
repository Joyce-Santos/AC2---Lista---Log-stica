package veiculo;

public class Caminhao extends VeiculoModel{
    private int quantidadeEixos;

    public Caminhao(String nome, double combustivel, double consumo, String placa, int quantidadeEixos) {
        super(nome, TipoVeiculo.CAMINHAO, combustivel, consumo, placa);
        this.quantidadeEixos = quantidadeEixos;
    }


    @Override
    public double retornaGastoComCombustivel(double distancia, double valorCombustivel) {
        return 0;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }
}
