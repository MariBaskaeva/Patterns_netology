import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, m, f;
        List<Integer> list = new ArrayList<>();
        List<Integer> result;

        Logger logger = Logger.getInstance();
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        StringBuilder builder;

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка: ");
        n = in.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        m = in.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(rand.nextInt(m));
        }
        builder = new StringBuilder("\nВот случайный список: ");
        for (Integer i : list) {
            builder.append(i + " ");
        }
        logger.log("Создаём и наполняем список" + builder);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        f = in.nextInt();
        Filter filter = new Filter(f);
        result = filter.filterOut(list);
        builder = new StringBuilder("\nОтфильтрованный список: ");
        for (Integer i : result) {
            builder.append(i + " ");
        }
        logger.log("Выводим результат на экран" + builder);
        logger.log("Завершаем программу");
    }
}