package Chapter4;

public class SongTestDrive {

    public static void main (String[] args) {
        Song t2 = new Song();
        t2.setArtist("Soufal");
        t2.setTitle("SingOne");

        Song s3 = new Song();
        s3.setTitle("MY song");
        s3.setArtist("Soufal2");

        t2.play();
        s3.play();
    }
}
