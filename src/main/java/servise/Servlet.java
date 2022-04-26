package servise;

import java.util.Scanner;

public class Servlet implements Scan{
    @Override
    public void scanClient() {
        System.out.println("Для получения данных введите 1");
        System.out.println("Для записи в базу данных введите 2");

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        HandlerClient handCliend = new HandlerClient();

        switch (a) {
            case 1:
                System.out.println("Введите id");
                long id = scan.nextLong();
                      handCliend.getId(id);
                      break;
            case 2:
                System.out.println("Введите имя");
                String name = scan.next();
                handCliend.setName(name);
                break;
        }
    }
}
