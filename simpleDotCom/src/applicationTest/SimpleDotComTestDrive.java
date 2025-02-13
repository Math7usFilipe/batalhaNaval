package applicationTest;

import entities.SimpleDotCom;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        //instancia de um objeto simpleDotCom
        SimpleDotCom dot = new SimpleDotCom();

        /*
        * cria uma matriz int para o local das dot com
        * (3 insts consecutivos entre 7 possíveis)
        */
        int[] locations = {2, 3, 4};

        //chama o método de configuração na variável dot com
        dot.setLocationCells(locations);

        //cria um palpite de usuário fictício
        String userGuess = "2";

        //chama método checkYourSelf() no objeto dot com e passa para ele o palpite ficticio
        String result = dot.checkYourSelf(userGuess);
        String testResult = "failed";
        if(result.equals("hit")) {
            //se o palpite fictício(2) retornar um "acerto", o código estará funcionando
            testResult = "passed";
        }

        //exibe p resultado do teste
        System.out.println(testResult);
    }


}
