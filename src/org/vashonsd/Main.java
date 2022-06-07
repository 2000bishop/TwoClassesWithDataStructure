package org.vashonsd;

public class Main {

    public static void main(String[] args) {
	    TestScores scores1 = new TestScores("Bishop");
        scores1.addScore(78);
        scores1.addScore(56);
        scores1.addScore(100);
        System.out.println(scores1);
        RunTimes runTimes = new RunTimes(10.34);
        runTimes.setTime("Esme", 12.34);
        System.out.print(whoMadeCutoff(Esme));
    }

}
