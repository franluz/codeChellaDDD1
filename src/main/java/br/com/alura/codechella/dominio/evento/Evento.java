package br.com.alura.codechella.dominio.evento;

import br.com.alura.codechella.dominio.ingresso.TipoIngresso;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class Evento {
    private UUID uuid;
    private Categoria categoria;
    private String descricao;
    private LocalDateTime data;
    private Endereco endereco;
    private List<TipoIngresso> tipoIngressos = new ArrayList<TipoIngresso>();

    public Evento(Categoria categoria, String descricao, LocalDateTime data, Endereco endereco) {
        this.categoria = categoria;
        this.descricao = descricao;
        this.data = data;
        this.endereco = endereco;
        gerarIdentificadorUnico();
    }

    private Evento() {
        super();
    }

    private void gerarIdentificadorUnico() {
        this.uuid = UUID.randomUUID();
    }

    public void incluiNovoTipoDeIngressoAoEvento(TipoIngresso tipoIngresso) {
        this.tipoIngressos.add(tipoIngresso);
    }

    public void aumentaNumeroDeIngressosPorTipo() {
        //implementar
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<TipoIngresso> getTipoIngressos() {
        return tipoIngressos;
    }

    public static class EventoBuilder {
        private Evento evento;

        public EventoBuilder() {
            evento = new Evento();
        }

        public EventoBuilder comCategoria(Categoria categoria) {
            evento.categoria = categoria;
            return this;
        }

        public EventoBuilder comDescricao(String descricao) {
            evento.descricao = descricao;
            return this;
        }

        public EventoBuilder comEndereco(Endereco endereco) {
            this.evento.endereco = endereco;
            return this;
        }

        public EventoBuilder comData(LocalDateTime data) {
            this.evento.data = data;
            return this;
        }

        public Evento build() {
            evento.gerarIdentificadorUnico();
            return evento;
        }
    }

    @Override
    public String toString() {
        return "Evento{" +
                "uuid=" + uuid +
                ", categoria=" + categoria +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                ", endereco=" + endereco +
                ", tipoIngressos=" + tipoIngressos +
                '}';
    }
}
