package Exer3;

import Exer3.builders.RelatorioBuilder;
import Exer3.entidades.Relatorio;

public class Main {
    public static void main(String[] args) {
        comBuilder();
    }

    public static void comBuilder() {
        Relatorio relatorioPadrao = new RelatorioBuilder()
                .setTitulo("Relatório semanal")
                .setCorpo("Este é o corpo do relatório semanal.")
                .build();

        Relatorio relatorioCompleto = new RelatorioBuilder()
                .setTitulo("Relatório mensal")
                .setCorpo("Este é o corpo do relatório mensal.")
                .setRodape("Este é o rodapé do relatório mensal.")
                .build();

        System.out.println(relatorioPadrao);
        System.out.println("===================\n");
        System.out.println(relatorioCompleto);
    }
}
