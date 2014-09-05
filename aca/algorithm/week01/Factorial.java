class Factorial {
    private static int factorial(int i) {
        if (i == 0 || i == 1)
            return 1;
        else
            return i * factorial(i - 1);
    }
    
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            
            System.out.println(i + "      " + factorial(i));
        }
    }
}