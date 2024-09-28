package Builder;

public abstract class Drink implements Item {
    @Override
    public Packing getPacking() {
        return new Bottle();
    }
}
