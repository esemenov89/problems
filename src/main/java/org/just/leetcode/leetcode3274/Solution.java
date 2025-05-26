package org.just.leetcode.leetcode3274;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static final Map<String, Boolean> CHESSBOARD = new HashMap<>();

    static {
        CHESSBOARD.put("a1", false);
        CHESSBOARD.put("a2", true);
        CHESSBOARD.put("a3", false);
        CHESSBOARD.put("a4", true);
        CHESSBOARD.put("a5", false);
        CHESSBOARD.put("a6", true);
        CHESSBOARD.put("a7", false);
        CHESSBOARD.put("a8", true);

        CHESSBOARD.put("b1", true);
        CHESSBOARD.put("b2", false);
        CHESSBOARD.put("b3", true);
        CHESSBOARD.put("b4", false);
        CHESSBOARD.put("b5", true);
        CHESSBOARD.put("b6", false);
        CHESSBOARD.put("b7", true);
        CHESSBOARD.put("b8", false);

        CHESSBOARD.put("c1", false);
        CHESSBOARD.put("c2", true);
        CHESSBOARD.put("c3", false);
        CHESSBOARD.put("c4", true);
        CHESSBOARD.put("c5", false);
        CHESSBOARD.put("c6", true);
        CHESSBOARD.put("c7", false);
        CHESSBOARD.put("c8", true);

        CHESSBOARD.put("d1", true);
        CHESSBOARD.put("d2", false);
        CHESSBOARD.put("d3", true);
        CHESSBOARD.put("d4", false);
        CHESSBOARD.put("d5", true);
        CHESSBOARD.put("d6", false);
        CHESSBOARD.put("d7", true);
        CHESSBOARD.put("d8", false);

        CHESSBOARD.put("e1", false);
        CHESSBOARD.put("e2", true);
        CHESSBOARD.put("e3", false);
        CHESSBOARD.put("e4", true);
        CHESSBOARD.put("e5", false);
        CHESSBOARD.put("e6", true);
        CHESSBOARD.put("e7", false);
        CHESSBOARD.put("e8", true);

        CHESSBOARD.put("f1", true);
        CHESSBOARD.put("f2", false);
        CHESSBOARD.put("f3", true);
        CHESSBOARD.put("f4", false);
        CHESSBOARD.put("f5", true);
        CHESSBOARD.put("f6", false);
        CHESSBOARD.put("f7", true);
        CHESSBOARD.put("f8", false);

        CHESSBOARD.put("g1", false);
        CHESSBOARD.put("g2", true);
        CHESSBOARD.put("g3", false);
        CHESSBOARD.put("g4", true);
        CHESSBOARD.put("g5", false);
        CHESSBOARD.put("g6", true);
        CHESSBOARD.put("g7", false);
        CHESSBOARD.put("g8", true);

        CHESSBOARD.put("h1", true);
        CHESSBOARD.put("h2", false);
        CHESSBOARD.put("h3", true);
        CHESSBOARD.put("h4", false);
        CHESSBOARD.put("h5", true);
        CHESSBOARD.put("h6", false);
        CHESSBOARD.put("h7", true);
        CHESSBOARD.put("h8", false);
    }

    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        boolean result = false;
        return result;
    }
}