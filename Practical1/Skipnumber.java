public class Skipnumber {
     public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            if (num == 25 || num == 40 || num == 90) {
                continue;
            }
            System.out.println(num);
        }
    }
}
