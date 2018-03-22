import java.util.ArrayList;
import java.util.Iterator;

public class Feed {
    private final ArrayList<Post> posts;

    /**
     * Constructor for the feed class.
     */
    public Feed() {
        this.posts = new ArrayList<>();
    }

    /**
     * Add a post to the feed.
     * @param post the post to add to the feed.
     */
    public void addPost(Post post) {
        posts.add(post);
    }

    /**
     * Display all the posts in the feed.
     */
    public void display() {
        for (Post post : posts) {
            post.display();
            System.out.println();  // empty line between posts
        }
    }

    /**
     * Display all the posts in the feed, with comments.
     */
    public void displayWithComments() {
        for (Post post : posts) {
            post.display();
            post.displayComments();
        }
    }

    /**
     * Return the iterator of the posts.
     * @return the iterator of the posts.
     */
    public Iterator<Post> getIterator() {
        return posts.iterator();
    }
}
