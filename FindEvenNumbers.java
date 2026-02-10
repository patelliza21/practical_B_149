public class FindEvenNumbers {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        System.out.println("Even numbers between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                
                sum += i;
                if (i < min) {
                    min = i;
                }
                if (i > max) {
                    max = i;
                }
            }
        }

      
        System.out.println("\n\n--- Results ---");
        System.out.println("Minimum even number: " + min);
        System.out.println("Maximum even number: " + max);
        System.out.println("Total (Sum) of all even numbers: " + sum);
    }
}