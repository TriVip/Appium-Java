package labs.lab6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Lab6_5 {
    public static void main(String[] args) {
        System.out.println("Nhập vào một câu: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        // Loại bỏ dấu chấm câu và chuyển tất cả về chữ thường để đếm chính xác
        sentence = sentence.toLowerCase().replaceAll("[.,?!]", "");

        // Tách câu thành từng từ dựa trên khoảng trắng
        String[] words = sentence.split("\\s+");

        // Sử dụng HashMap để đếm số lần xuất hiện của mỗi từ
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!word.trim().isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Số lần xuất hiện của mỗi từ:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
