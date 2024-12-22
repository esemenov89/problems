package prime.numbers;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) throws IOException {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        System.out.println("Поиск простых чисел");
        System.out.println("Укажите диапозон поиска простых чисел");
        System.out.print("Введите начальное число диапозона поиска простых чисел:");
        Scanner scanner = new Scanner(System.in);
        String from = scanner.nextLine();
        System.out.println();
        System.out.print("Введите конечно число диапозона поиска простых чисел:");
        String to = scanner.nextLine();
        primeNumbers.searchPrimeNumbers(from, to);
    }

    public void searchPrimeNumbers(String from, String to) throws IOException {
        BigInteger start = new BigInteger(from);
        BigInteger finish = new BigInteger(to);
        BigInteger number;
        String numberString;
        String digitString;
        new FileWriter("src/prime/numbers/result.txt").close();
        FileWriter writer = new FileWriter("src/prime/numbers/result.txt", true);
        boolean isSimple;
        for (BigInteger i = start; i.compareTo(finish) <= 0; i = i.add(BigInteger.ONE)) {
            number = i;
            numberString = number.toString();
            digitString = numberString.substring(numberString.length() - 1);
            if ("0".equals(digitString) || "2".equals(digitString) || "4".equals(digitString) || "5".equals(digitString)
                    || "6".equals(digitString) || "8".equals(digitString)) {
                continue;
            }
            isSimple = true;
            for (BigInteger j = BigInteger.valueOf(2); j.compareTo(i.divide(BigInteger.TWO)) <= 0; j = j.add(BigInteger.valueOf(1))) {
                if (i.divideAndRemainder(j)[1].equals(BigInteger.ZERO)) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                writer.write(i.toString());
                writer.write("\n");
                System.out.println(i);
            }
        }
        writer.close();
    }
}