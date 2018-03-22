public class NetworkApp {
    private Feed feed;

    public NetworkApp() {
        feed = new Feed();
    }

    public void dummyPosts() {
        feed.addPost(new TextPost("kverna", "halla makkaronis"));
        feed.addPost(new TextPost("kverna", "aiiiii makkaronis"));
        feed.addPost(new TextPost("mang", "påske noa"));
        feed.addPost(new TextPost("kåre", "hm funka d da"));
        TextPost p1 = new TextPost("makker", "nei nei gutt, dette må bli slutt!");
        p1.addComment("mang", "lol dårlig post");
        p1.addLike();
        feed.addPost(p1);
        PhotoPost p2 = new PhotoPost("kåre", "meme.jpeg", "dank maymay");
        p2.addLike();
        p2.addLike();
        p2.addLike();
        p2.addComment("ssssasASss", "woooop woooop");
        p2.addComment("sssASassss", "woooop wosooop");
        p2.addComment("sssssss", "woooop wasdasdoooop");
        p2.addComment("ssssASasss", "woooasdasdop woooop");

        feed.addPost(p2);
    }

    public void displayAllPosts() {
        feed.displayWithComments();
    }

    public static void main(String[] args) {
        NetworkApp app = new NetworkApp();
        app.dummyPosts();
        app.displayAllPosts();
    }
}
