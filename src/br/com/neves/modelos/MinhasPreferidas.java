package br.com.neves.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9)
            System.out.println(audio.getNome() + " é " +
                    "considerado sucesso absoluto e " +
                    "preferido por todos!");
        else
            System.out.println(audio.getNome() + " é con" +
                    "siderado sucesso absoluto e pr" +
                    "eferido por todos!");
    }
}
