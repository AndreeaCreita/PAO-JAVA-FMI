public class Noragami implements Anime{
    private String genre;
    private int episodes;
    private String protagonist;

    public Noragami(String genre, int episodes, String protagonist) {
        this.genre = genre;
        this.episodes = episodes;
        this.protagonist = protagonist;
    }
    public void notifyAnime()
    {
        System.out.println("Noragami hereeE!!");
    }
}
