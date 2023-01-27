

public class Main {
    public static void susp() {
        System.out.println ("++++++++++");
        System.out.println("XXXXXXXXXXX");

    }
    public static void issuance (int iss) {
        System.out.println(iss);
    }
    public static int sum (int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println("начнем веселье");
        susp();
        int[] mounth = {10, 2, 3, 4, 5, 6, 7, 8, 14, 9, 22, 42, 88};
        for (int i = 0; i < mounth.length; i++) {
            issuance(mounth[i]);
            if ((i+1) % 3 == 0) {
                susp();

            }
        }
        susp();
        int total = sum(mounth);
        issuance(total);

    }
}