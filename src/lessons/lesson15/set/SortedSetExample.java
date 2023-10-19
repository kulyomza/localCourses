package lessons.lesson15.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

    public static void main(String[] args) {
        SortedSet<String> mySortedSet = new TreeSet<>();
        mySortedSet.add("A");
        mySortedSet.add("C");
        mySortedSet.add("D");
        mySortedSet.add("B");
        mySortedSet.add("N");
        mySortedSet.add("O");
        mySortedSet.add("P");
        mySortedSet.add("R");
        mySortedSet.add("E");
        mySortedSet.add("Q");
        mySortedSet.add("2");
        mySortedSet.add("123");

        System.out.println(mySortedSet);

        SortedSet<Integer> mySortedSet2 = new TreeSet<>();
        mySortedSet2.add(2);
        mySortedSet2.add(123);

        System.out.println(mySortedSet2);


    }
}
