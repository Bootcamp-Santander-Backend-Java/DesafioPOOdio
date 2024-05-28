package br.com.dio.desafio.dominium;

import java.time.LocalDate;

public class Mentoria extends Conteudo {  // exetendendo a classe pai Conteudo

    private LocalDate data;


    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }



    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo" + getTitulo() + '\'' +
                ", descrição" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}

