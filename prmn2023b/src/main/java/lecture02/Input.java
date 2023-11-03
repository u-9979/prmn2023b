package lecture02;

import java.util.Scanner;

public class Input {

    String gakuseki;

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力してください:");
        gakuseki = scan.next();
    }

    void hantei(String[][] num) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            if (num[i][0].equals(gakuseki)) {
                System.out.print("パスワードを入力してください:");
                String pas = scan.next();
                if (num[i][1].equals(pas)) {
                    System.out.println("ログイン完了");
                    break;
                } else {
                    System.out.println("不正なアクセス");
                    System.exit(0);
                }
            }else if(i ==4) {
                System.out.println("error!!");
                System.exit(0);
            }
        }
    }

}