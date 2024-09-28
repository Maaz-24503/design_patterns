package Builder;

public class Coke extends Drink{
    @Override
    public float getPrice() {
        return 0.50f;
    }

    @Override
    public String getName() {
        return "Coke";
    }
}
