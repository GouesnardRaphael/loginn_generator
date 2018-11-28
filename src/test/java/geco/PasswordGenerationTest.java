package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    PasswordGeneration pw = new PasswordGeneration();

    @Test
    public void getRandomPassword() {
        String mdp = pw.getRandomPassword();
        assertFalse(mdp.isEmpty());
    }
}