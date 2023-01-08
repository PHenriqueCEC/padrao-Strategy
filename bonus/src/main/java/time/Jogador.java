package time;

public class Jogador {
    private float bonus;

    public float getBonus() {
        return bonus;
    }

    public void bonusTrofeuCampeaoLibertadores(float bonus) {
        Calculadora calculadora = new Calculadora(bonus);
        this.bonus = calculadora.setBonus(new TrofeuCampeaoLibertadores());
    }

    public void bonusTrofeuCampeaoBrasileiro(float bonus) {
        Calculadora calculadora = new Calculadora(bonus);
        this.bonus = calculadora.setBonus(new TrofeuCampeaoBrasileiro());
    }

    public void bonusTrofeuCampeaoCopaDoBrasil(float bonus) {
        Calculadora calculadora = new Calculadora(bonus);
        this.bonus = calculadora.setBonus(new TrofeuCampeaoCopaDoBrasil());
    }


}