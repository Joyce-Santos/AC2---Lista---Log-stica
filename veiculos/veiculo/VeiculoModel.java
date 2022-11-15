package veiculo;

public abstract class VeiculoModel implements VeiculoInterface, Comparable<VeiculoModel> {
    private String nome;
    private TipoVeiculo tipoVeiculo;
    private double combustivel;
    private double consumo;
    private String placa;

    public VeiculoModel(String nome, TipoVeiculo tipoVeiculo, double combustivel, double consumo, String placa) {
        this.nome = nome;
        this.tipoVeiculo = tipoVeiculo;
        this.combustivel = combustivel;
        this.consumo = consumo;
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    @Override
    public double getCombustivel() {
        return combustivel;
    }

    @Override
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public double getConsumo() {
        return consumo;
    }

    @Override
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public int compareTo(VeiculoModel o) {
        return this.nome.compareTo(o.getNome());
    }

    @Override
    public String toString() {
        return "Veiculo: " +
                "nome='" + nome + '\'' +
                ", tipoVeiculo=" + tipoVeiculo +
                ", combustivel=" + combustivel +
                ", consumo=" + consumo +
                ", placa='" + placa;
    }
}
