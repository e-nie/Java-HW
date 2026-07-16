package mock_prep.OOPTasks.object_state_lifecycle.internet_order.likes_system;

import java.util.HashSet;
import java.util.Set;

public class Post {
    private String id;
    private String text;
    private Set<String> likes;

    public Post(String id, String text) {
        this.id = id;
        this.text = text;
        likes = new HashSet<>();
    }

    public void like(String user) {
        likes.add(user);
        System.out.println("User " + user + " liked the post!");
    }

    public void unlike(String user) {
        likes.remove(user);
    }

    public int getLikesCount() {
        return likes.size();
    }

    public boolean isLikesBy(String user) {
        return likes.contains(user);
    }
}
