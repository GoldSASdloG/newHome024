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

        int spaseCount = 0;
        boolean correctSimvols = true;

        String text = scanner.nextLine().trim();
        for (int i = 0; i < text.length(); i++) {
            if (!CORRECT_TEXT.contains(String.valueOf(text.charAt(i)))) {
                correctSimvols = false;
                System.out.println("Введена ерунда!!!");
                break;
            }
            if (text.charAt(i) == ' ') {
                spaseCount++;
            }
        }

        if (correctSimvols && spaseCount == 2) {
            System.out.println("Фамилия: " + text.substring(0,text.indexOf(" ")).trim());
            System.out.println("Имя: " + text.substring(text.indexOf(" "), text.lastIndexOf(" ")).trim());
            System.out.println("Отчество: " + text.substring(text.lastIndexOf(" ")).trim());
        } else {
            System.out.println("Введенная строка не является ФИО !!!");
        }
    }
}