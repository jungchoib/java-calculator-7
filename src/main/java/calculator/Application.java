package calculator;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        String input;
        // input
        Scanner scanner = new Scanner(System.in);
        System.out.print("덧셈할 문자열을 입력해 주세요.\n");
        input = scanner.nextLine();
        // output
        try {
            long result = Long.parseLong(input);
            System.out.print("결과 : " + result);
        // Handle non-valid input
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("유효하지 않은 숫자 형식입니다: " + input, e);
        }
    }
}