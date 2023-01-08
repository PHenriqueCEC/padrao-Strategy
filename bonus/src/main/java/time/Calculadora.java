package time;

public class Calculadora {

    private float bonus;

    public Calculadora(float bonus) {
        this.bonus = bonus;
    }
    public float setBonus(Trofeu jogando){
        return jogando.setBonus(bonus);
    }
}
