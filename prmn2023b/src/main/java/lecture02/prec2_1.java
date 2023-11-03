package lecture02;

import java.util.Scanner;
public class prec2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("氏名を入力してください:");
        String name_1 = scan.next();
        System.out.print("学籍番号を入力してください:");
        int num = scan.nextInt();

        System.out.println("氏名:" + name_1 + ",学籍番号:" + num);
    }
}
