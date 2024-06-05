import java.util.Scanner;

public class A2 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("정수 2개를 입력하세요");
int n = scanner.nextInt(); // n 입력 받기
int m = scanner.nextInt(); // m 입력 받기

int z = m;
int multiply = 1; // 곱셈 결과를 저장할 변수, 1로 초기화해야 함
while (m > 0) { // m번 반복
multiply *= n; // multiply에 n을 곱함
m--; // m을 1 감소시킴
}
System.out.printf("%d의 %d제곱수는 %d입니다", n, z, multiply);
scanner.close();
}
}
// multiply 변수값을 n으로 곱하고 그 결과를 다시 multiply에 저장을 반복하기
