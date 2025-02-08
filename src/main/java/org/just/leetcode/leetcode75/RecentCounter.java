package org.just.leetcode.leetcode75;

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
            deleteFromQueue(t - range);
            queue.add(t);
        }
        return queue.size();
    }

    private void deleteFromQueue(int currentStartOfRange) {
        for (int i = queue.size() - 1; i >= 0; i--) {
            if (currentStartOfRange > queue.peek()) {
                queue.remove();
            } else {
                break;
            }
        }
    }
}
