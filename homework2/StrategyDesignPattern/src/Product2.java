import java.util.Random;

public class Product2 implements Produs{
    @Override
    public int getPrice() {
        return 23;
    }

    @Override
    public int getDiscount() {
        return 15;
    }

    @Override
    public Enum<MoneySpent> getMoneySpent() {
        Random random = new Random();
        if(random.nextBoolean()==true)
        {
            System.out.println("High price for Product 2");
            return MoneySpent.HIGH_PRICE;
        }
        System.out.println("Low price for Product 2");
        return MoneySpent.LOW_PRICE;
    }
}
