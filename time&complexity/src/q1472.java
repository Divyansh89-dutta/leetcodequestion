import java.util.ArrayList;
import java.util.List;

class BrowserHistory {

    private List<String> history;
    private int current;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        current = 0;
    }

    public void visit(String url) {
        // Remove forward history
        while (history.size() > current + 1) {
            history.remove(history.size() - 1);
        }

        history.add(url);
        current++;
    }

    public String back(int steps) {
        current = Math.max(0, current - steps);
        return history.get(current);
    }

    public String forward(int steps) {
        current = Math.min(history.size() - 1, current + steps);
        return history.get(current);
    }
}

public class q1472 {
    public static void main(String[] args) {

        BrowserHistory bh = new BrowserHistory("leetcode.com");

        bh.visit("google.com");
        bh.visit("facebook.com");
        bh.visit("youtube.com");

        System.out.println(bh.back(1));    // facebook.com
        System.out.println(bh.back(1));    // google.com
        System.out.println(bh.forward(1)); // facebook.com

        bh.visit("linkedin.com");

        System.out.println(bh.forward(2)); // linkedin.com
        System.out.println(bh.back(2));    // google.com
        System.out.println(bh.back(7));    // leetcode.com
    }
}
