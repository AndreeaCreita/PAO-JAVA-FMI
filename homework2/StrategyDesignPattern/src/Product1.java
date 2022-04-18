import java.util.Random;

public class Product1 implements Produs{
    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public int getDiscount() {
        return 20;
    }

    @Override
    public Enum<MoneySpent> getMoneySpent() {
        Random random = new Random();
        if(random.nextBoolean()==true)
        {
            System.out.println("High price for Product 1");
            return MoneySpent.HIGH_PRICE;
        }
        System.out.println("Low price for Product 1");
        return MoneySpent.LOW_PRICE;
    }
}
