package homeworks.hm12;

public class ContinuePractice {
    public static void main(String[] args) {
        int some = 0; // Изначально ноль
        while(some < 10) { // Работает пока меньше 10
            some++; // В каждой итерации увеличиваем на 1
            if(some % 2 == 0) // Если четное, то пропускаем число
                continue; // Пропуск итерации
            System.out.println(some); // Вывод в консоль
        }
        int[] ia = {1,3,5,7,9};
                 for(int x : ia) {
                        for(int j = 0; j < 3; j++) {
                               if(x > 4 && x < 8) continue;
                System.out.print(" " + x);
                              if(j == 1) break;
                              continue;
                           }
                       continue;
        }
    }
}
