public class EratosthenesPrimeSieve implements PrimeSieve{
    private int obergrenze;

    public EratosthenesPrimeSieve(int obergrenze) {
        this.obergrenze = obergrenze;
    }

    @Override
    public boolean isPrime(int p) {
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void printPrimes() {
        System.out.println("Primzahlen:" );
        for (int i = 2; i < this.obergrenze; i++) {
            boolean prime = isPrime(i);
            if (prime){
                System.out.println(i);
            }
        }
    }
}
