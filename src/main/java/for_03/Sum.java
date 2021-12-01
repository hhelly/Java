package for_03;

/*
 * 8393번 합
 *
 *  문제 : n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 *  입력 : 첫째 줄에 n(1 <= n <= 10,000)이 주어진다.
 *  출력 : 1부터 n까지 합을 출력한다.
 *
 *  예제 입력 1
 *  3
 *  예제 출력 1
 *  6
 *
 * */

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        for(int idx1 = 1 ; idx1 < n+1 ; idx1++) {
            result += idx1;
        }

        System.out.println(result);
    }
}
