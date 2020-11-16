package day06;

import java.util.Random;

import util.ArrayUtil;

public class Ex09LottoNumbers {
    private static final int SIZE = 6;
    private static final int MAX = 45;
    public static void main(String[] args) {
        Random random = new Random();
        int[] lottoNumbers = new int[0];
        while(lottoNumbers.length < SIZE) {
            int randomNumbers = random.nextInt(MAX)+1;
            if(!ArrayUtil.contains(lottoNumbers, randomNumbers)) {
                lottoNumbers = ArrayUtil.add(lottoNumbers, randomNumbers);
            }
        }
        for(int i = 0; i < lottoNumbers.length; i++) {
            System.out.printf("%d번 숫자: %d\n", i, lottoNumbers[i]);
        }
    }
}
