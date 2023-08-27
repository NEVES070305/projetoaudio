package br.com.neves.modelos;

import br.com.neves.modelos.Audio;

public class Podcasts extends Audio {
    private int temporada;
    private int episodio;
    private String host;
    private String convidados;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public int getClassificacao(){
        if(this.getCurtidas() > 500){
            return 10;
        }else {
            return 8;
        }
    }
}
