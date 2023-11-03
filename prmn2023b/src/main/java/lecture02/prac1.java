package lecture02;

import java.util.Scanner;
public class prac1 {
    public static void main(String[] args) {

        String number = "B2222160";

        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力して下さい:");
        String gakuseki = scan.next();

        Gakuseki g = new Gakuseki();
        g.hantei(number,gakuseki);
    }
}
