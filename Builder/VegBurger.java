package Builder;

public class VegBurger extends Burger{
    @Override
    public float getPrice() {
        return 1.75f;
    }

    @Override
    public String getName() {
        return "Veg Burger";
    }
}
