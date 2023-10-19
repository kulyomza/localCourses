package lessons.lesson12.interfaceEample;

public interface IParts {
    int chosePart(int number);

    default double partsPrice(int number) {
        return 33.33 * number + Math.random() * 0.5;
    }
}
