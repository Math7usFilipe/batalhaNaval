package entities;

public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    //captura o palpite do usuário
    public String checkYourSelf(String stringGuess) {
        //converte o palpite(String) em um int
        int guess = Integer.parseInt(stringGuess);

        /*
        * cria uma variável para armazenar o resultado que retornamos.
        * Inserimos 'miss' como resultado padrão, presumindo o "erro"
        */
        String result = "miss";

        //reprete para cada célula da matriz locationCells
        for(int cell : locationCells) {
            if(guess == cell) {
                result = "hit";//ocorreu um acerto
                numOfHits++;//interamos a quantidade de acertos
                break; //sai do loop
            }
        }
        //após sair do loop verificamos se terminamos o jogo
        //caso ocorra 3 acertos alteramos o resultado para "kill"
        if(numOfHits == locationCells.length) {
            result = "kill";
        }

        //exibe o resultado para o usuário
        System.out.println(result);

        //retorna o resultado para o método chamador
        return result;
    }
}