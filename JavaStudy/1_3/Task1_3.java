public class Task1_3 {

    public static void main(String[] args) {

        // ① 5 と 10 を加算した値を代入する、変数 plus を作成しなさい。
         int plus = 0;

         plus = 5 + 10;

        // ② 20 から 7 を減算した値を代入する、変数 minus を作成しなさい。
         int minus = 0;

         minus = 20 - 7;

        // ③下記の処理について、何をしているのかコメントを記入してください。
        // [int型の変数multiplyに10と2の乗算した結果(20)を代入する。]
        int multiply = 10 * 2;

        // ④ 20 を 6 で割った余りを代入する、変数 remi を作成しなさい。
        int remi = 20;

        remi %= 6;

        // ⑤下記の処理について、何をしているのかコメントを記入してください
        // [String型の変数townには有楽町、lineには線を代入する。]
        String town = "有楽町";
        String line = "線";

        // ⑥ ⑤で作成した変数を連結させた値を代入する変数 train を作成しなさい。
        String train = town + line;

        // ⑦ 変数plus, minus, multiply, remi, train をそれぞれ出力しなさい。
        System.out.println(plus);

        System.out.println(minus);

        System.out.println(multiply);

        System.out.println(remi);

        System.out.println(train);

    }
}