package Builder;

public class BeefBurger extends Burger{
    @Override
    public float getPrice() {
        return 2.00f;
    }

    @Override
    public String getName() {
        return "Beef Burger";
    }
}
