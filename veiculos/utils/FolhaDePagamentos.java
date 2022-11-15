package utils;

import condutor.Condutor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class FolhaDePagamentos {
    private int mes;
    private int ano;

    public FolhaDePagamentos(int mes, int ano) {
        this.mes = mes;
        this.ano = ano;
    }

    public void imprimir(List<Condutor> condutores) {
        Relatorios.imprimeCondutores(condutores);
        System.out.println("Valor total a pagar: R$ "+ valorAPagar(condutores).setScale(2, RoundingMode.HALF_EVEN).doubleValue());
    }

    public BigDecimal valorAPagar(List<Condutor> condutores) {
        AtomicReference<BigDecimal> valorTotalAPagar = new AtomicReference<>(BigDecimal.ZERO);

        condutores.forEach(condutor -> {
            valorTotalAPagar.set(valorTotalAPagar.get().add(condutor.getSalario()));
        });

        return valorTotalAPagar.get();
    }
}
