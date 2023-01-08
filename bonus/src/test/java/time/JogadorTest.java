package time;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JogadorTest {

    @Test
    void deveRetornarBonusLibertadores() {
        Jogador jogador = new Jogador();
        jogador.bonusTrofeuCampeaoLibertadores(20000.0f);
        assertEquals(40000.0f, jogador.getBonus());
    }

    @Test
    void deveRetornarBonusBrasileiro() {
        Jogador jogador = new Jogador();
        jogador.bonusTrofeuCampeaoBrasileiro(20000.0f);
        assertEquals(30000.0f, jogador.getBonus());
    }

    @Test
    void deveRetornarBonusCopaDoBrasil() {
        Jogador jogador = new Jogador();
        jogador.bonusTrofeuCampeaoCopaDoBrasil(20000.0f);
        assertEquals(24000.0f, jogador.getBonus());
    }

}
