package br.com.alura.codechella;

import br.com.alura.codechella.dominio.evento.Categoria;

import br.com.alura.codechella.dominio.evento.DadosEndereco;
import br.com.alura.codechella.dominio.evento.Endereco;
import br.com.alura.codechella.dominio.evento.Evento;

import java.time.LocalDateTime;

public class TesteFabricaEvento {
    public static void main(String[] args) {
        Evento evento = new Evento.EventoBuilder()
                .comCategoria(Categoria.MUSICA)
                .comDescricao("The Weeknd")
                .comData(LocalDateTime.parse("2025-11-19T19:00:00"))
                .build();
        System.out.println(evento);
    }
}