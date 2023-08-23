import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        boolean isSunny = true;
        if (isRain()) {
            System.out.println("Troi nang ");
        } else if (isSunny) {
            System.out.println("Troi mua ");
        } else if (true) {
            System.out.println("Troi khong mua khong nang ");
        } else if (false) {
            System.out.println("Troi vua nang vua mua ");
        }
// xét đến điều kiện true

        int a = 20;
        int host = isRain() ? 100 : 0;

        int month = 8;
        switch (month) {
            case 4:
            case 6:
                System.out.println("30 ngay");
                break;
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 ngay");
                break;
            case 2:
                System.out.println("29 ngay");
                break;
            default:
                System.out.println("b = 300000");
                break;
        }
    }

        private static boolean isRain() {
            return true;
        }
    }
