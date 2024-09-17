public class EratosthenesPrimeSieve implements PrimeSieve{
    private int obergrenze;

    public EratosthenesPrimeSieve(int obergrenze) {
        this.obergrenze = obergrenze;
    }

    @Override
    public boolean isPrime(int value) {
        if (value == 2) {
            return true;
        }else if (value <= 2) {
            return false;
        }
        for (long i = 2; i * i<= value; i++) {
            if (value % i == 0) {
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
