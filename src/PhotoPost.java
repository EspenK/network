public class PhotoPost extends Post {
    private final String photo;
    private final String caption;

    /**
     * Constructor for the photo post class.
     * @param author the author of the post.
     * @param photo the photo.
     * @param caption the caption text.
     */
    public PhotoPost(String author, String photo, String caption) {
        super(author);
        this.photo = photo;
        this.caption = caption;
    }

    /**
     * Return the photo (file name).
     * @return the photo.
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * Return the caption text.
     * @return the caption text.
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Display information about this post.
     */
    public void display() {
        System.out.println("\t" + getPhoto() + ": " + getCaption());
        super.display();
    }
}
