import condutor.Condutor;
import utils.FolhaDePagamentos;
import utils.Relatorios;
import veiculo.Caminhao;
import veiculo.Carro;
import veiculo.Moto;
import veiculo.VeiculoModel;
import viagem.Viagem;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Condutor> condutores = new ArrayList<>();
        List<VeiculoModel> veiculos = new ArrayList<>();
        List<Viagem> viagens = new ArrayList<>();

        Condutor jose = new Condutor("Jose Antonio", "45537202841",
                LocalDate.of(1990, 10, 12), BigDecimal.valueOf(2750.20));
        Condutor carlos = new Condutor("Jose Antonio", "23337202841",
                LocalDate.of(1985, 2, 20), BigDecimal.valueOf(5125.00));
        Condutor pedro = new Condutor("Pedro Paulino", "11137202841",
                LocalDate.of(1966, 5, 24), BigDecimal.valueOf(10257.25));

        condutores.add(jose);
        condutores.add(carlos);
        condutores.add(pedro);

        Relatorios.imprimeCondutores(condutores);
        System.out.println();
        Moto moto = new Moto("Moto", 25, 12.5, "ABAE5D4F", 125);
        Carro carro = new Carro("Carro", 52, 7, "EL3I58DE", 5);
        Caminhao caminhao = new Caminhao("Caminhao", 75, 15, "SKF125FL", 8);

        veiculos.add(carro);
        veiculos.add(moto);
        veiculos.add(caminhao);

        Relatorios.imprimeVeiculos(veiculos);
        System.out.println();
        Viagem viagem1 = new Viagem("Sorocaba", "Votorantim", 14, carro, jose);
        Viagem viagem2 = new Viagem("Votorantim", "Manaus", 10512, caminhao, pedro);
        Viagem viagem3 = new Viagem("Manaus", "Recife", 12900, moto, carlos);

        viagens.add(viagem1);
        viagens.add(viagem2);
        viagens.add(viagem3);

        Relatorios.imprimeViagens(viagens);


        FolhaDePagamentos folhaDePagamentos = new FolhaDePagamentos(12, 2022);

        System.out.println();
        folhaDePagamentos.imprimir(condutores);
    }
}