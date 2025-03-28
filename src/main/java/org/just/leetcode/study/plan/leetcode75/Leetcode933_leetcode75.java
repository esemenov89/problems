package org.just.leetcode.study.plan.leetcode75;

import java.util.Date;

public class Leetcode933_leetcode75 {

    /*

You have a RecentCounter class which counts the number of recent requests within a certain time frame.

Implement the RecentCounter class:
RecentCounter() Initializes the counter with zero recent requests.
int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.


Example 1:
Input
["RecentCounter", "ping", "ping", "ping", "ping"]
[[], [1], [100], [3001], [3002]]
Output
[null, 1, 2, 3, 3]

Explanation
RecentCounter recentCounter = new RecentCounter();
recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3

Constraints:

1 <= t <= 10^9
Each test case will call ping with strictly increasing values of t.
At most 10^4 calls will be made to ping.

    */

    public static void main(String[] args) {
        long startDate = new Date().getTime();
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));
        System.out.println(recentCounter.ping(100));
        System.out.println(recentCounter.ping(3001));
        System.out.println(recentCounter.ping(3002));
        System.out.println("milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        // Output: 1 2 3 3
        RecentCounter recentCounter2 = new RecentCounter();
        System.out.println(recentCounter2.ping(1));
        System.out.println(recentCounter2.ping(10000));
        System.out.println("milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        // Output: 1 1
        RecentCounter recentCounter3 = new RecentCounter();
        for (int i = 0; i < 10000; i++) {
            System.out.println(recentCounter3.ping(i));
        }
        System.out.println("milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        // Output:
    }
}