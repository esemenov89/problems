package studyplan.leetcode75;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    private final Queue<Integer> queue = new LinkedList<>();
    private final int range = 3000;
    private int count = 0;

    public RecentCounter() {

    }

    public int ping(int t) {
        if (queue.isEmpty()) {
            queue.add(t);
        } else {
            if (queue.peek() - t < range) {
                queue.add(t);
            } else {
                queue.remove();
            }
        }
        return queue.size();
    }
}
