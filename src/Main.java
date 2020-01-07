import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        System.out.println("Введите число A ");
        int a = thread.scanIntA();

        System.out.println("Введите число В ");

        int b = thread.scanIntB();

        MyThread myThread = new MyThread(a, b);
        myThread.start();

    }

    public static class MyThread extends Thread {
        public int a, b;

        public MyThread(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public void setA(int a) {
            this.a = a;
        }

        public void setB(int b) {
            this.b = b;
        }

        public MyThread() {
        }

        public Integer scanIntA() {
            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextInt()) {
                System.out.println("Введите число типа int");
                scanIntA();
            } else {
                a = scanner.nextInt();
            }

            return a;

        }

        public Integer scanIntB() {
            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextInt()) {
                System.out.println("Введите число типа int");
                scanIntB();
            } else {
                b = scanner.nextInt();
            }
            return b;
        }

        @Override
        public void start() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите математический знак");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            while (scanner.hasNext()) {
                String task = scanner.next();
                switch (task) {
                    case "+":
                        System.out.println(a + b);
                        break;
                    case "-":
                        System.out.println(a - b);
                        break;
                    case "/":
                        System.out.println(a / b);
                        break;
                    case "%":
                        System.out.println(a % b);
                        break;
                    case "==":
                        System.out.println(a == b);
                        break;
                    case ">":
                        System.out.println(a > b);
                        ;
                        break;
                    case "<":
                        System.out.println(a < b);
                        break;
                    default:
                        System.out.println("Введите адекватный символ!");
                }
                break;
            }
        }
    }
}
