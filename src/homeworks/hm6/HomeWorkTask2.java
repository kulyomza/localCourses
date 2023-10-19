package homeworks.hm6;

public class HomeWorkTask2 {
    public static void main(String[] args) {
        school();

    }

    public static void school() {

        for (int lesson = 1; lesson < 4; lesson++) {
            System.out.println("Это " + lesson + "-й урок!");
            if(lesson < 3){
                System.out.println("Я выполнил все домашние задания " + lesson + "-го урока.");
            }else {
                System.out.println("Я не выполнил домашнее задания " + lesson + "-го урока.");
            }
        }
        System.out.println();
    }
}
