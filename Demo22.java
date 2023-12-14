import java.util.Scanner;
class Demo22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print(" song title: ");
        String title = sc.nextLine();

        System.out.print("artist name: ");
        String artist = sc.nextLine();

        System.out.print("duration (in minutes): ");
        double duration = sc.nextDouble();

        Song userSong = new Song(title, artist, duration);
       
        System.out.println("\nSong Information:\n" + userSong);

    }
}
class Song {
    private String title;
    private String artist;
    private double duration;
    
    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String toString() {
        return "Song: " + title + "\nArtist: " + artist + "\nDuration: " + duration + " minutes";
    }
}