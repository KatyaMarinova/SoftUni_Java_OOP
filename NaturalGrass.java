package football.entities.field;

import football.entities.player.Player;
import football.entities.supplement.Supplement;

import java.util.Collection;

public class NaturalGrass extends BaseField {

    private static final int CAPACITY = 250;

    public NaturalGrass(String name) {
        super(name, CAPACITY);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int sumEnergy() {
        return super.sumEnergy();
    }

    @Override
    public void addPlayer(Player player) {
        super.addPlayer(player);
    }

    @Override
    public void removePlayer(Player player) {
        super.removePlayer(player);
    }

    @Override
    public void addSupplement(Supplement supplement) {
        super.addSupplement(supplement);
    }

    @Override
    public void drag() {
        super.drag();
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    @Override
    public Collection<Player> getPlayers() {
        return super.getPlayers();
    }

    @Override
    public Collection<Supplement> getSupplements() {
        return super.getSupplements();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
