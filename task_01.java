import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class task_01 {
    public static void main(String[] args) {
        Map<String, List<String>> book = new HashMap<>();
        book.put("Pavel", List.of("8 935465464", "6586435486651"));
        book.put("Alexey", List.of("56855313546"));
        book.put("Ylia", List.of("8 56 89 61 55 68","8 92 28 85 58 35"));
        menu(book);
    }
    public static Map<String, List<String>> menu(Map<String, List<String>> book) {
        while (true) {
            System.out.println( "Меню: \n1. Найти контакт \n2. Добавить контакт"+
                " \n3. Печать телефонной книги \n4. Выход");
            System.out.print("\nвыберите пункт меню-> ");
            String comands = scan();
            if (comands.equals("4")) {
                break;
            } else {
                switch (comands) {
                    case "1":
                        find(book);
                        break;
                    case "2":
                        add(book);
                        break;
                    case "3":
                        allBook(book);
                        break;
                    default:
                        break;
                }
            }
        }
        return book;
    }
    public static String scan()
    {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        return scan;
    }
    public static void find(Map<String, List<String>> phoneBook)
    {
        System.out.print("Имя абонента: ");
        String name = scan();
        System.out.println("Имя: "+ name +"\nТелефон(ы): "+ phoneBook.get(name));
    }    
    public static void allBook(Map<String, List<String>> AllBook) 
    {
        for (var item : AllBook.entrySet()) 
        {
            System.out.println("Имя: " + item.getKey() + "\nНомер" + item.getValue());
        }
    } 
    public static Map<String, List<String>> add(Map<String, List<String>> book) 
    {
        System.out.print("Имя абонента: ");
        String name = scan();
        List<String> data = new ArrayList<>();
        while (true) {
            System.out.println("Если номеров больше нет, введите '5'");
            System.out.print("Введите номер: ");
            String nomer = scan();
            if (nomer.equals("5")) {
                break;
            } else {
                data.add(nomer);
            }
        }
        book.put(name, data);
        return book;
    }
}