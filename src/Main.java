public class Main {
    public static void main(String[] args) {

        // 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        // 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }

        // 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // 8
        int money = 29000;
        for (int i = 1; i <= 12; i++) {
            int totalMoney = money * i;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalMoney + " рублей");
        }

        // 9
        int Money = 29000;
        int TotalMoney = 0;
        for (int i = 1; i <= 12; i++) {
            TotalMoney = TotalMoney + TotalMoney / 100;
            TotalMoney = TotalMoney + Money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + TotalMoney + " рублей");
        }

        // 10
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            int total = number * i;
            System.out.println(number + "*" + i + "=" + total);
       }
   }
}