package viagem;

import condutor.Condutor;
import veiculo.VeiculoModel;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Viagem implements Comparable<Viagem> {
    private String cidadeOrigem;
    private String cidadeDestino;
    private double distancia;
    private VeiculoModel veiculo;
    private Condutor condutor;

    public Viagem(String cidadeOrigem, String cidadeDestino, double distancia, VeiculoModel veiculo, Condutor condutor) {
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.distancia = distancia;
        this.veiculo = veiculo;
        this.condutor = condutor;
    }

    public Double custo() {
        //TODO: de onde vem esse parametro?
        BigDecimal valorGasolina = BigDecimal.valueOf(5);

        BigDecimal diariaCondutor = condutor.getSalario().divide(BigDecimal.valueOf(30), RoundingMode.HALF_EVEN)
                .multiply(BigDecimal.valueOf(Math.round(distancia / 700)));

        BigDecimal consumoCarro = BigDecimal.valueOf(veiculo.getConsumo()).multiply(valorGasolina);

        return diariaCondutor.add(consumoCarro).doubleValue();
    }

    @Override
    public int compareTo(Viagem o) {
        return this.custo().compareTo(o.custo());
    }

    @Override
    public String toString() {
        return "Viagem: " +
                "cidadeOrigem='" + cidadeOrigem + '\'' +
                ", cidadeDestino='" + cidadeDestino + '\'' +
                ", distancia=" + distancia +
                ", veiculo=" + veiculo +
                ", condutor=" + condutor +
                " custo da viagem: " + custo();
    }
}
