import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    Queue<Integer> q = new LinkedList<>();
    public RecentCounter() {

    }

    public int ping(int t) {
        q.add(t);
        while(q.peek() < t - 3000){
            q.poll();
        }
        return q.size();
    }
}
public class Q933 {
    public static void main(String[] args) {

        RecentCounter rc = new RecentCounter();

        System.out.println(rc.ping(1));    // 1
        System.out.println(rc.ping(100));  // 2
        System.out.println(rc.ping(3001)); // 3
        System.out.println(rc.ping(3002)); // 3
    }
}

