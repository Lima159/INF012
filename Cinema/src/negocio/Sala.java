/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Aluno
 */
public abstract class Sala {
        private int numero;
        private int quantidade;
        private String sessao;
        private int cadeiras;
        private double lucro;
        private String tipo;

    public Sala(int numero, int quantidade, String sessao, int cadeiras, double lucro, String tipo) {
        this.numero = numero;
        this.quantidade = quantidade;
        this.sessao = sessao;
        this.cadeiras = cadeiras;
        this.lucro = lucro;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getSessao() {
        return sessao;
    }

    public int getCadeiras() {
        return cadeiras;
    }

    public double getLucro() {
        return lucro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public void setCadeiras(int cadeiras) {
        this.cadeiras = cadeiras;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
        
    public abstract double venda();    
}
