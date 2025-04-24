import java.util.Scanner;

public class Main {
    public static final String CORRECT_TEXT = "- абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    public static void main(String[] args) {
        System.out.println("!!!  Введите ФИО  !!!");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) {
            System.out.println("Введены не корректные данные!");
            scanner.close();
        }

        boolean correctSimvols = true;
        String text = scanner.nextLine().trim();
        for (int i = 0; i < text.length(); i++) {
            if (!CORRECT_TEXT.contains(String.valueOf(text.charAt(i)))) {
                correctSimvols = false;
                System.out.println("Введена ерунда!!!");
                break;
            }
        }
    }
}