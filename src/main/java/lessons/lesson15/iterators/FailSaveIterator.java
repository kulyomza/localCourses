package lessons.lesson15.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSaveIterator {
    public static void main(String[] args) {
        List<Integer> myList = new CopyOnWriteArrayList<>();
        myList.add(1);
        myList.add(7);
        myList.add(5);
        myList.add(11);
        myList.add(8);

        System.out.println("Before iteration " + myList);

        Iterator<Integer> myIterator = myList.iterator();
        while (myIterator.hasNext()){
            Integer nextValue = myIterator.next();
            if(nextValue.equals(5)){
                myList.remove(2);
            }
        }
        System.out.println("After iteration " + myList);

    }
}
