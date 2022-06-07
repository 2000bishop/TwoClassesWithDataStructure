package org.vashonsd;

import java.util.ArrayList;

public class TestScores {
    ArrayList<Integer> scores = new ArrayList<>();
    String studentName;

    public TestScores(String studentName) {
        this.studentName = studentName;
    }

    public void addScore(int n) {
        scores.add(n);
    }

    @Override
    public String toString() {
        return studentName + "'s scores:";
    }
}
