package time;

public class TrofeuCampeaoLibertadores implements Trofeu {

    @Override
    public float setBonus(float bonus) {
        return bonus * 2;
    }
}
