import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HamburguerBuildTest {

    @Test
    void deveRetornarExcecaoParaHamburguerMuitoGrande() {
        try {
            HamburguerBuilder hamburguerBuilder = new HamburguerBuilder();
            Hamburguer hamburguer = hamburguerBuilder
                    .setBife(100)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Escolha um hamburguer com menos bifes", e.getMessage());
        }
    }


    @Test
    void deveRetornarHamburguerValido() {
        HamburguerBuilder hamburguerBuilder = new HamburguerBuilder();
        Hamburguer hamburguer = hamburguerBuilder
                .setNome("BicMac")
                .setBife(2)
                .setSalada("alface")
                .setQueijo(true)
                .setMolho("molho especial")
                .setPicles(true)
                .setPao("gergelim")
                .build();

        assertNotNull(hamburguer);
    }
}
