public class EratosthenesPrimeSieve implements PrimeSieve{
    private int obergrenze;

    public EratosthenesPrimeSieve(int obergrenze) {
        this.obergrenze = obergrenze;
    }

    @Override
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        int limit = (int) Math.sqrt(n);
        for (int i = 5; i <= limit; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void printPrimes() {
        System.out.println("Primzahlen:" );
        for (int i = 0; i < this.obergrenze; i++) {
            boolean prime = isPrime(i);
            if (prime){
                System.out.println(i);
            }
        }
    }
}
