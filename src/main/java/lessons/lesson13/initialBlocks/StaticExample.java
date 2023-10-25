package lessons.lesson13.initialBlocks;

public class StaticExample {
    static String name;
    {
        name = "Alex";
        age = 34;
        isWork = true;
    }
    public StaticExample(){

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean isWork(){
        return isWork;
    }
    public void setWork(boolean work){

    }
    static int age;
    static boolean isWork;

}
