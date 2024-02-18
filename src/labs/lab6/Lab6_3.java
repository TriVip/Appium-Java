package labs.lab6;

public class Lab6_3 {
    /*
    String myStr = "100 minutes";
    NOT using REGEX, extract digit character from that String
    Expected output: "100".
     */
    public static void main(String[] args) {
        String myStr = "100 minutes";
        String digitStr = "";

        for (int index = 0; index < myStr.length(); index++) {
            char ch = myStr.charAt(index); // Lấy ký tự tại vị trí i

            // Kiểm tra xem ký tự có phải là số hay không
            if (ch >= '0' && ch <= '9') {
                digitStr += ch;
            }
        }

        System.out.println(digitStr);
    }
}




