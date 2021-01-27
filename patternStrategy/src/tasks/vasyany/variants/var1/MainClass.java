package tasks.vasyany.variants.var1;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strategyString = scanner.nextLine();
        StrategyFactory strategyFactory = new StrategyFactory();

        Strategy strategy = strategyFactory.getCurrentStrategy(strategyString);
        strategy.getStrategy();
    }
}
