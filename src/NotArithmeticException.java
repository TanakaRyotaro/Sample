
public class NotArithmeticException {

    public static void main(String[] args) {
        //double型10.0をdouble型0.0で除算
        double a = 10.0/0.0; //この場合は例外発生しない！！
        
        //この下の出力は実行されない！！
        System.out.println(a);
    }

}
