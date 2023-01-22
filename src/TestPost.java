class Director implements Post {
    @Override
    public void showPost () {
        System.out.println("Your post is: " + this.getClass().getName());
    }
}

class Employee implements Post {
    @Override
    public void showPost() {
        System.out.println("Your post is: " + this.getClass().getName());
    }
}

class Accountant implements Post {
    @Override
    public void showPost() {
        System.out.println("Yor post is: " + this.getClass().getName());
    }
}

interface Post {
    void showPost();
}

public class TestPost {
    public static void main(String[] args) {
        Post post = new Director();

        post.showPost();
    }
}