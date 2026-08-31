class Song {
    public String title;
    public String artist;
    public int length;
    public String mesg;

    public Song(String t, String a, int l) {
        title = t;
        artist = a;
        length = l;
    }

    public void songInfo() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Length: " + length + " minutes");
    }
}

class Playlist {
    String album;
    Song[] songs;
    int count = 0;

    public Playlist(String album) {
        this.album = album;
        songs = new Song[100];
        count = 0;

        System.out.println(album + " created");
    }

    public void info() {
        System.out.println(album + " has the following songs");
        if (count == 0) {
            System.out.println("No songs in " + album + ".");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("Song " + (i + 1));
                songs[i].songInfo();
            }
        }
    }

    public void addSong(Song s) {
        songs[count] = s;
        count++;

        System.out.println(s.title + "added to " + album + ".");
    }

    public void addSong(Song s, int index) {
        if (index < 0 || index > count) {
            System.out.println("Cannot add song to Index: " + index + ".");
            return;
        }
        for (int i = count; i > index; i--) {
            songs[i] = songs[i - 1];
        }
        songs[index] = s;
        count++;

        System.out.println(s.title + "added to " + album + ".");
    }

    public void deleteSong(String title) {
        int index = -1;

        for (int i = 0; i < count; i++) {
            if (songs[i].title.equals(title)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println(title + " not found in " + album + ".");
            return;
        }
        for (int i = index; i < count - 1; i++) {
            songs[i] = songs[i + 1];
        }
        songs[count - 1] = null;
        count--;

        System.out.println(title + " deleted from " + album + ".");
    }

}

public class SpotifyTester {
    public static void main(String[] args) {
        Song s1 = new Song("Song - A", "Artist-A", 3);
        System.out.println("1===================");
        s1.songInfo();
        System.out.println("2===================");
        Playlist p1 = new Playlist("First Playlist");

        System.out.println("3===================");
        p1.info();
        System.out.println("4===================");
        p1.addSong(s1);
        System.out.println("5===================");
        p1.info();
        System.out.println("6===================");
        Song s2 = new Song("Song-B", "Artist-B", 4);
        Song s3 = new Song("Song-C", "Artist-C", 5);
        p1.addSong(s2);
        p1.addSong(s3);
        System.out.println("7===================");
        p1.info();
        System.out.println("8===================");

        Song s4 = new Song("Song-D", "Artist-D", 3);
        Song s5 = new Song("Song-E", "Artist-E", 4);
        Song s6 = new Song("Song-F", "Artist-F", 2);
        Song s7 = new Song("Song-G", "Artist-G", 2);
        p1.addSong(s4, 0);
        p1.addSong(s5, 2);
        p1.addSong(s6, 5);
        p1.addSong(s7, 10);
        System.out.println("9===========");
        p1.info();
        System.out.println("10==========");
        System.out.println("12==========");
        // Continuation from Task 6
        p1.deleteSong("Song-D");
        p1.deleteSong("Song-B");
        p1.deleteSong("Song-F");
        p1.deleteSong("Song-K");
        System.out.println("13==========");
        p1.info();
        System.out.println("14==========");
    }
}
