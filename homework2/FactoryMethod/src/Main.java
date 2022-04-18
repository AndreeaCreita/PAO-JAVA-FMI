//The factory design pattern says that define an interface
// ( A java interface or an abstract class) and let the subclasses
// decide which object to instantiate.
public class Main {
    public static void main(String[] args) {
        Anime newAnime = AnimeFactory.createAnime(Anime.FRUITSBASKET);
        newAnime.notifyAnime();
    }
}
