 public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();
        scanner.close();
        
        int sum = 0, negatives = 0;
        for (int i = 0, k = 0; i < n; ) {
            sum += array[i++];
            if (sum < 0)
                negatives++;
            if (i == n) {
                i = ++k;
                sum = 0;
            }
        }
        System.out.println(negatives);
        
    }
}
