package org.just.leetcode.study.plan.leetcode75.leetcode841;

import java.util.List;
import java.util.Stack;

public class Solution {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        // Будем класть ключи в стек
        //'seen' массив для показа того смотрели ли мы комнату или нет.
        while (!stack.isEmpty()) { // Пока есть ключи
            int node = stack.pop(); // берем крайний ключ
            for (int nei: rooms.get(node)) // для каждого ключа
                if (!seen[nei]) { // ...и комнаты который мы не видели
                    seen[nei] = true; // отмечаем что мы посещали комнату
                    stack.push(nei); // и добавляем кго в стек
                }
        }

        for (boolean v: seen)  // если хотя бы одна комната не была посещена, то отдаем фолс
            if (!v) return false;
        return true;
    }
}