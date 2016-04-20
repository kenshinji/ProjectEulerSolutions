/**
 * Created by kenshinji on 4/20/2016.
 */
public class CircularPrimes {

    public static void main(String[] args) {
        boolean[] isPrime = checkPrimes(1000000);
        int count =0;

        for(int i=0;i<isPrime.length;i++) {
            if(isPrime[i]&&isCircularPrime(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isCircularPrime(int prime) {
        String str = String.valueOf(prime);
        int shiftTime = str.length()-1;
        while (shiftTime > 0) {
            if (isPrime(Integer.valueOf(str.substring(shiftTime) + str.substring(0, shiftTime)))) {
                shiftTime--;
            }else{
                return false;
            }
        }
        return true;
    }

    private static boolean[] checkPrimes(int n) {
        boolean[] resultArray = new boolean[n];
        for(int i = 0;i< n;i++) {
            resultArray[i] = isPrime(i);
        }
        return resultArray;
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
