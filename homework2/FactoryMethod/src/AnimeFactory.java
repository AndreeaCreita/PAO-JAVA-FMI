public class AnimeFactory {
    public static Anime createAnime(String type){
        if(type.equals(Anime.FRUITSBASKET))
        {
            return new FruitsBasket("shoujo", 23, 5);
        }
        else if(type.equals(Anime.NORAGAMI))
        {
            return new Noragami("shounen", 12, "Yato");
        }
        else if(type.equals(Anime.SHINGEKINOBAHAMUT))
        {
            return new ShingekiNoBahamut("Action", 22);
        }
        else
        {
            return null;
        }
    }
}
