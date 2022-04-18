public class FruitsBasket implements Anime{
    private String genre;
    private int episodes;
    private int rank;

    public FruitsBasket(String genre, int episodes, int rank) {
        this.genre = genre;
        this.episodes = episodes;
        this.rank = rank;
    }
    public void notifyAnime()
    {
        System.out.println("Fruits Basket hereeE!!");
    }
}
