public class FindEvenNumbers {
    public static void main(String[] args) {

        int sum = 0, count = 0;

        System.out.print("Even Numbers (1–50): ");
        for (int i = 2; i <= 50; i += 2) {
            System.out.print(i + " ");
            sum += i;
            count++;
        }

        double average = (double) sum / count;

        System.out.println("\n\nMinimum Three Even Numbers:");
        System.out.println("2 4 6");

        System.out.println("\nMaximum Three Even Numbers:");
        System.out.println("46 48 50");

        System.out.println("\nAverage of Even Numbers: " + average);
    }
}
