package com.github.Ukasz09.designPatternsExamples.creationalPatterns.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Politician politician1 = new Politician(1);
        Politician politician2 = new Politician(2);
        Politician politician3 = new Politician(3);

        System.out.format("\n%s government money before corruption scandals= %f\n", Government.getInstance().getCountry(), Government.getInstance().getLiabilitiesAsPercentOfPKB());
        for (int i = 0; i < 5; i++) {
            politician1.madeCorruptionScandal();
            politician2.madeCorruptionScandal();
            politician3.madeCorruptionScandal();
        }

        System.out.format("Politician no.%d has stolen %f money from government\n", politician1.getId(), politician1.getStolenMoneyFromGovernment());
        System.out.format("Politician no.%d has stolen %f money from government\n", politician2.getId(), politician2.getStolenMoneyFromGovernment());
        System.out.format("%s government money after corruption scandals= %f\n", Government.getInstance().getCountry(), Government.getInstance().getLiabilitiesAsPercentOfPKB());
    }
}
