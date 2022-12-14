package football.entities.player;

public class Women extends BasePlayer {
    private static final double KG = 60;
    public Women(String name, String nationality, int strength) {
        super(name, nationality, KG, strength);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setNationality(String nationality) {
        super.setNationality(nationality);
    }

    @Override
    public void setStrength(int strength) {
        super.setStrength(strength);
    }

    @Override
    public double getKg() {
        return super.getKg();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getStrength() {
        return super.getStrength();
    }

    @Override
    public void stimulation() {
      int newStrength = getStrength() + 115;
      setStrength(newStrength);
    }
}
