package ch02.ricky;

import java.util.Arrays;
import java.util.Comparator;
public class ComparatorTest {


    public static void main(String[] args) {
        AppleTest.Apple[] appleList = {
                new AppleTest.Apple(AppleTest.Color.GREEN, 100),
                new AppleTest.Apple(AppleTest.Color.GREEN, 30),
                new AppleTest.Apple(AppleTest.Color.GREEN, 40),
                new AppleTest.Apple(AppleTest.Color.RED, 50),
                new AppleTest.Apple(AppleTest.Color.RED, 80),
                new AppleTest.Apple(AppleTest.Color.GREEN, 10)
        };

//		Arrays.asList(appleList).sort(new Comparator<Apple>() {
//			@Override
//			public int compare(Apple o1, Apple o2) {
//				return o1.getWeight().compareTo(o2.getWeight());
//			}
//		});

        Arrays.asList(appleList).sort((AppleTest.Apple a1, AppleTest.Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));

        System.out.println(Arrays.asList(appleList));

    }
}