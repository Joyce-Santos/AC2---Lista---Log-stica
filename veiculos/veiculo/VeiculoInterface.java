package veiculo;

public interface VeiculoInterface {

    double getCombustivel();
    double getConsumo();
    String getPlaca();

    void setCombustivel(double combustivel);
    void setConsumo(double consumo);
    void setPlaca(String placa);

    double retornaGastoComCombustivel(double distancia, double valorCombustivel);
}
