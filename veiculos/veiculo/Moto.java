package veiculo;

public class Moto extends VeiculoModel {
    private int cilindradas;
    @Override
    public double getCombustivel() {
        return super.getCombustivel();
    }

    public Moto(String nome, double combustivel, double consumo, String placa, int cilindradas) {
        super(nome, TipoVeiculo.MOTO, combustivel, consumo, placa);
        this.cilindradas = cilindradas;
    }

    @Override
    public double retornaGastoComCombustivel(double distancia, double valorCombustivel) {
        return 0;
    }

    public int getCilindradas() {
        return cilindradas;
    }
}
