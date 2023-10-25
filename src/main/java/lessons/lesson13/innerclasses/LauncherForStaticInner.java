package lessons.lesson13.innerclasses;

public class LauncherForStaticInner {
    public static void main(String[] args) {
        OuterCarStatic.Inner_Electric inner_electric = new OuterCarStatic.Inner_Electric();
        new OuterCarStatic.Inner_Electric();
        inner_electric.turnOnIgnition();
    }
}
