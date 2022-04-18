public class Artist {

    private Art paint;
    private Art design;
    private Art drawing;

    public Artist(){
        paint = new Paint();
        design = new Design();
        drawing = new Drawing();
    }

    public void ArtistOfPaint(){
        paint.create();
    }
    public void ArtistOfDesign(){
        design.create();
    }
    public void ArtistOfDrawing(){

        drawing.create();
    }
}
