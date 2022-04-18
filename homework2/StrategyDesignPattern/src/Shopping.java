public class Shopping {
    private Produs product;

    public Shopping(){
        product = this.getBestProduct();
    }

    private Produs getBestProduct(){
        Produs product1 = new Product1();
        Produs product2 = new Product2();

        if(product1.getMoneySpent() == MoneySpent.LOW_PRICE && product2.getMoneySpent() == MoneySpent.HIGH_PRICE)
        {
            System.out.println("Selecting Low Price product -> product 1");
            return product1;
        }
        System.out.println("Selecting Product2");
        return product2;
    }

    public void shop()
    {
        product.getPrice();
    }
}
