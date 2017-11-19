public class Odds {
        public static void main(String[] args) {
            //even numbers display
            for (int n = 1; n <= 100; n += 2) {
                System.out.print(n + " ");
                if ((n + 1) % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

