import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Bai 1");
        upperCaseCheck();
        System.out.println("Bai 2");
        nonNumericCheck();
        System.out.println("Bai 3");
        findOccurrencesCheck();
        System.out.println("bai 4");
        wordCount();
        System.out.println("Bai 7");
        vowelAndConsonantCount();
    }

    public static void upperCaseCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ky tu: ");
        String s = scanner.nextLine();

        int contentLength = s.length();
        for (int i = 0; i < contentLength; i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                System.out.println("Ky tu tai vi tri: " + i + " la chu hoa (" + s.charAt(i) + ")");
            }
        }
    }

    public static void nonNumericCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ky tu: ");
        String s = scanner.nextLine();

        int contentLength = s.length();
        for (int i = 0; i < contentLength; i++) {
            if (Character.isLetter(s.charAt(i))) {
                System.out.println("Ky tu tai vi tri: " + i + " khong phai la so (" + s.charAt(i) + ")");
            }
        }
    }

    public static void findOccurrencesCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ky tu: ");
        String s = scanner.nextLine();
        System.out.print("Nhap vao ky tu so sanh: ");
        char c = scanner.next().charAt(0);

        int total = 0;
        int contentLength = s.length();
        for (int i = 0; i < contentLength; i++) {
            if (s.charAt(i) == c) {
                total++;
            }
        }

        System.out.println("Co : " + total + " ky tu " + c + " trong chuoi " + s);
    }

    public static void wordCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ky tu: ");
        String s = scanner.nextLine();

        String[] word = s.trim().split("\\s+");
        System.out.println("Co : " + word.length + " tu trong chuoi " + s);
    }

    public static void vowelAndConsonantCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ky tu: ");
        String s = scanner.nextLine();

        int countVowel = 0;
        int countConsonant = 0;
        s = s.toLowerCase();

        for (char i : s.toCharArray()) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                countVowel++;
            } else if (i >= 'a' && i <= 'z') {
                countConsonant++;
            }
        }
        System.out.println("So nguyen am trong chuoi s la: " + countVowel);
        System.out.println("So phu am trong chuoi s la: " + countConsonant);
    }
}
