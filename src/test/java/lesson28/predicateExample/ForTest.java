package lesson28.predicateExample;

import java.util.function.Predicate;

public class ForTest {
    public static void main(String[] args) {
        IMyPredicate myPredicate = new IMyPredicate() {
            @Override
            public boolean test(Integer value) {
                return value > 0;
            }
        };

        System.out.println(myPredicate.test(5));

        IMyPredicate myPredicate1 = value -> value > 0;
        System.out.println(myPredicate1.test(10));
        System.out.println(myPredicate1.test(11));
        System.out.println(myPredicate1.test(0));
        System.out.println(myPredicate1.test(-1));
        System.out.println(myPredicate1.test(-5));



        Predicate<Integer> predicate = x -> x > 0;
        System.out.println(predicate.test(3));
    }
}
