
public class ArithmeticOperations {

    public static void main(String[] args) {
        // 変数宣言と初期化
        int num1=100;//int型num1を宣言し100を代入
        int num2=10;

        //int型変数resultを宣言し、num1とnum2の加算結果を代入
        int result=num1+num2;
        System.out.println("num1 + num2 = "+result);
        //int型変数result2を宣言し、num1とnum2の減産結果を代入
        int result2=num1-num2;
        System.out.println("num1 - num2 = "+result2);
        //int型変数result3を宣言し、num1とnum2の乗算結果を代入
        int result3=num1*num2;
        System.out.println("num1 * num2 = "+result3);
        //int型変数result4を宣言し、num1とnum2の除算結果を代入
        int result4=num1/num2;
        System.out.println("num1 / num2 = "+result4);
        //int型変数result5を宣言し、num1とnum2の剰余算結果を代入
        int result5=num1%num2;
        System.out.println("num1 % num2 = "+result5);
    }
}