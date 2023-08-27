package br.com.neves.modelos;

public class Audio {
    private int duracaoEmMinutos;
    private String nome;
    private boolean gratuidade;
    private double preco;
    private String autor;
    private int curtidas;
    private int totalDeReproducoes;
    private int classificacao;
    private int somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isGratuidade() {
        return gratuidade;
    }

    public void setGratuidade(boolean gratuidade) {
        this.gratuidade = gratuidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    private void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public void curtir(){
        this.curtidas++;
    }

//    public void avaliar(int avaliacao){
//        this.totalDeAvaliacoes++;
//        this.somaDasAvaliacoes+=avaliacao;
//        this.setClassificacao(this.somaDasAvaliacoes/this.totalDeAvaliacoes);
//    }
    public void reproduzir(){
        this.totalDeReproducoes++;
    }

}
