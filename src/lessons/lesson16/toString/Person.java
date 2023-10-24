package lessons.lesson16.toString;

public class Person {

    private String name;
    private int age;
    private boolean retired;

    public Person(String name, int age, boolean retired) {
        this.name = name;
        this.age = age;
        this.retired = retired;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean isRetired(){
        return retired;
    }
    public void setRetired(boolean retired){
        this.retired = retired;
    }

    @Override
    public String toString() {
        return "Name " + name + ". Age " + age + ". Retired " + retired;
    }
}
