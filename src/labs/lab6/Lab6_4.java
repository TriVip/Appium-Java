package labs.lab6;

public class Lab6_4 {
    public static void main(String[] args) {
        String url = "https://facebook.com";

        // Kiểm tra giao thức
        if (url.startsWith("http://")) {
            System.out.println("Giao thức là HTTP");
        } else if (url.startsWith("https://")) {
            System.out.println("Giao thức là HTTPS");
        }

        // Kiểm tra đuôi domain
        if (url.endsWith(".com")) {
            System.out.println("URL kết thúc bằng .com");
        } else if (url.endsWith(".net")) {
            System.out.println("URL kết thúc bằng .net");
        }

        // Tìm và in ra tên miền
        // Đầu tiên, loại bỏ giao thức
        String domain = url.replace("http://", "").replace("https://", "").replace(".com", ""). replace(".net", "");
        // Tiếp theo, loại bỏ bất kỳ thông tin đường dẫn nào sau tên miền
        if (domain.indexOf("/") > 0) {
            domain = domain.substring(0, domain.indexOf("/"));
        }
        System.out.println("Tên miền: " + domain);
    }
}

