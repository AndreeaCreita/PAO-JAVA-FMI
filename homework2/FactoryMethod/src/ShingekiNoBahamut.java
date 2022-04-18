public class ShingekiNoBahamut implements Anime{
private String genre;
private int episodes;

    public ShingekiNoBahamut(String genre, int episodes) {
        this.genre = genre;
        this.episodes = episodes;
    }
    public void notifyAnime()
    {
        System.out.println("Shingeki No Bahamut hereeE!!");
    }
}
