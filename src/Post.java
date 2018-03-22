import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;

/**
 * This class stores information about a post.
 *
 * @author Espen Kvernstad
 * @version 2018-03-21
 */

public class Post {
    private final String author;
    private final long timestamp;
    private final HashMap<String, String> comments;
    private int likes;

    /**
     * Constructor for the post class.
     * @param author the post authors username.
     */
    public Post(String author) {
        this.author = author;
        timestamp = System.currentTimeMillis();
        comments = new HashMap<>();
        likes = 0;
    }

    /**
     * Return the author of the post.
     * @return the author of the post.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Return the time of creation of this post.
     * @return the time of creation of this post.
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Return the number of likes of the post.
     * @return the number of likes of the post.
     */
    public int getLikes() {
        return likes;
    }

    /**
     * Add a like to the post.
     */
    public void addLike() {
        likes++;
    }

    /**
     * Remove a like from the post.
     */
    public void removeLike() {
        if (likes > 0) {
            likes--;
        }
    }

    /**
     * Add a comment to the post.
     * @param author the author of the comment.
     * @param comment the comment text.
     */
    public void addComment(String author, String comment) {
        comments.put(author, comment);
    }

    /**
     * Return the time difference between now and the time of creation of the post.
     * @return the time difference between now and the time of creation of the post.
     */
    public String timeString() {
        StringBuilder stringBuilder = new StringBuilder();
        long current = System.currentTimeMillis();
        long delta = current - getTimestamp();
        long seconds = delta / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        if (hours > 0) {
            stringBuilder.append(hours).append(" hours");
        }
        else if (minutes > 0) {
            stringBuilder.append(minutes).append(" minutes");
        }
        else {
            stringBuilder.append(seconds).append(" seconds");
        }
        return stringBuilder.toString();
    }

    /**
     * Display information about this post.
     */
    public void display() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Posted by ").append(getAuthor()).append(" ").append(timeString()).append(" ago.");
        stringBuilder.append("\n").append(getLikes()).append(" likes, ").append(comments.size()).append(" comments.");
        System.out.println(stringBuilder);
    }
}
