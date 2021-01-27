package tasks.vasyany.variants.var1;

public class StrategyFactory {
    public Strategy getCurrentStrategy(String s){

        String str = "1";
        Strategy strategy = null;

        if (s.equals("1")) {
            strategy = new Strategy1();
        } else if (s.equals("2")) {
            strategy = new Strategy2();
        } else if (s.equals("3")){
            strategy = new Strategy3();
        }

        return strategy;
    }
}
