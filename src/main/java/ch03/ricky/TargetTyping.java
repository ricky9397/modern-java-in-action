package ch03.ricky;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import ch03.ricky.AppleTest.Apple;
import ch03.ricky.AppleTest.Color;

public class TargetTyping {

    public static void main(String[] args) {

        execute((Action) () -> {});
//		execute(() -> {});

    }

    public static void execute(Runnable runnable) {
        runnable.run();
    }

    public static void execute(Action action) {
        action.act();
    }

    @FunctionalInterface
    interface Action {
        void act();
    }

    public void typeAssume() {
        Apple[] appleList = {
                new Apple(Color.GREEN, 100),
                new Apple(Color.GREEN, 30),
                new Apple(Color.GREEN, 40),
                new Apple(Color.RED, 50),
                new Apple(Color.RED, 80),
                new Apple(Color.GREEN, 10)
        };

        List<Apple> greenApples = Arrays.stream(appleList)
                .filter(apple -> Color.GREEN.equals(apple.getColor())) // (Apple) 타입 명시하지 않아도 된다.
                .collect(Collectors.toList());

        System.out.println(greenApples);
    }

}