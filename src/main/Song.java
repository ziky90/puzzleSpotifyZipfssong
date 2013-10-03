package main;

/**
 *
 * @author zikesjan
 */
public class Song implements Comparable<Song> {

    private String name;
    private long quality;
    private long position;

    public Song(long listenings, String name, long position) {
        this.name = name;
        this.position = position;
        this.quality = listenings * position;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Song t) {
        if (this.quality > t.quality) {
            return -1;
        } else if (this.quality == t.quality) {
            if (this.position < t.position) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }
}
