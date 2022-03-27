import java.util.Scanner;

public class SwithName {
    public static void information(){
        System.out.println("Для добавления новой книги нажмите 1");
        System.out.println("что б получить нфомацию о книге по номеру нажмите 2");
        System.out.println("что б удалить книгу по номеру нажмите 3");
        System.out.println("Что б получить книгу по еоличеству нажмите 4");
        System.out.println("Что б получить книгу по автору нажмите 5");
        System.out.println("Что б получить общее количество книг нажмите 6");
        Scanner scan = new Scanner(System.in);
        int inf = scan.nextInt();

        ReliseMethods SwithBook = new ReliseMethods();
        switch (inf){
            case(1): SwithBook.add();
            break;
            case (2): SwithBook.getByNumber();
            break;
            case (3): SwithBook.deleteByNumber();
            break;
            case (4): SwithBook.getCountByNumber();
            break;
            case(5): SwithBook.getByAuthor();
            break;
            case(6): SwithBook.getCountAllBooks();

        }



    }

}
