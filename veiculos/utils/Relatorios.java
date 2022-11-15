package utils;

import condutor.Condutor;
import veiculo.VeiculoModel;
import viagem.Viagem;

import java.util.Collections;
import java.util.List;

public abstract class Relatorios {

    public static void imprimeCondutores(List<Condutor> condutores) {
        Collections.sort(condutores);

        condutores.forEach(System.out::println);
    }

    public static void imprimeVeiculos(List<VeiculoModel> veiculos) {
        Collections.sort(veiculos);

        veiculos.forEach(System.out::println);
    }

    public static void imprimeViagens(List<Viagem> viagens) {
        Collections.sort(viagens);

        viagens.forEach(System.out::println);

    }
}
