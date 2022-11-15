package condutor;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Condutor implements Comparable<Condutor> {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private BigDecimal salario;

    public Condutor(String nome, String cpf, LocalDate dataNascimento, BigDecimal salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    @Override
    public int compareTo(Condutor o) {
        return this.cpf.compareTo(o.getCpf());
    }

    @Override
    public String toString() {
        return "Condutor: " +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", salario=" + salario;
    }
}
