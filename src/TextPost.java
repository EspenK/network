/**
 * This class stores information about a text post.
 * Sub class of post.
 *
 * @author Espen Kvernstad
 * @version 2018-03-21
 */
public class TextPost extends Post {
    private final String message;

    /**
     * Constructor for the text post class.
     * @param author the username of the author of the post.
     * @param message the message text.
     */
    public TextPost(String author, String message) {
        super(author);
        this.message = message;
    }

    /**
     * Return the message text of the post.
     * @return the message text of the post.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Display information about this post.
     */
    public void display() {
        System.out.println("\t" + getMessage());
        super.display();
    }

    /**
     * Display information about this post.
     */
    public void displayComments() {
        super.displayComments();
    }
}
