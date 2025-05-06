package br.com.alura.codechella.dominio.evento;

public class Endereco {
    private String cep;
    private Integer numero;
    private String complemento;

    public String getComplemento() {
        return complemento;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
