package lecture02;


public class prac3 {
    public static void main(String[] args) {
        String[][] num = new String[5][];
        for (int i = 0; i < 5; i++) {
            num[i] = new String[2];
        }

        num[0][0] = "B2220001";
        num[0][1] = "a";
        num[1][0] = "B2220011";
        num[1][1] = "b";
        num[2][0] = "B2221111";
        num[2][1] = "c";
        num[3][0] = "B2220111";
        num[3][1] = "d";
        num[4][0] = "B2222222";
        num[4][1] = "e";

        Input n = new Input();
        n.input();
        n.hantei(num);
        }
    }

