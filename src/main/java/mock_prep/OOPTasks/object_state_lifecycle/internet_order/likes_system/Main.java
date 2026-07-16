package mock_prep.OOPTasks.object_state_lifecycle.internet_order.likes_system;

public class Main {
    static void main(String[] args) {
        Post post  = new Post("01", "My first post");
        post.like("Anna");
        post.like("Eva");
        post.like("Yula");
        System.out.println("Number of likes: " + post.getLikesCount());
        System.out.println();

        post.unlike("Eva");
        System.out.println("Number of likes: " + post.getLikesCount());
        System.out.println();

        System.out.println(post.isLikesBy("Anna"));
    }
}
