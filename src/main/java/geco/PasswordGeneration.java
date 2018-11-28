package geco;

import java.util.Random;

public class PasswordGeneration {

    /**
     *
     * @return mdp ** le mots de passe alleatoire
     */
    public String getRandomPassword(){
        char rand;
        String mdp = "";
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            rand = (char)(r.nextInt(26) + 'a');
            mdp = mdp +rand;
        }
        return mdp;
    }
}
