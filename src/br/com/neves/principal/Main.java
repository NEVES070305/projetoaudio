package br.com.neves.principal;

import br.com.neves.modelos.MinhasPreferidas;
import br.com.neves.modelos.Musica;
import br.com.neves.modelos.Podcasts;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setNome("Sozinho");
        minhaMusica.setCantor("Caetano Veloso");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcasts meuPodcasts = new Podcasts();
        meuPodcasts.setNome("As aventuras de Sherlock Holmes");

        for (int i = 0; i < 5000; i++) {
            meuPodcasts.reproduzir();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcasts.curtir();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(minhaMusica);
        minhasPreferidas.inclui(meuPodcasts);


    }
}