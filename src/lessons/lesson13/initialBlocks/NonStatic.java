package lessons.lesson13.initialBlocks;

import static lessons.lesson13.initialBlocks.StaticExample.age;
import static lessons.lesson13.initialBlocks.StaticExample.isWork;

public class NonStatic {

    String name;


    {
        name = "Alex";
        age = 34;
        isWork = true;

    }
    public NonStatic() {

    }
    public NonStatic (String name, int age, boolean isWork){
        this.age = age;
        this.isWork = isWork;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public boolean isWork(){
        return isWork;
    }
    public void setIsWork(boolean isWork){
        this.isWork = true;
    }

    int age;
    boolean isWork;

}
