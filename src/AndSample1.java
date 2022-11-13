
public class AndSample1 {

    public static void main(String[] args) {
        int score = 50;
        
        if(score == 100) {
            System.out.println("満点です！おめでとう。");
        }else if(score >=80 && score <=99) {
            System.out.println("よくできました！合格です。");
        }else if(score >=60 && score <=79) {
            System.out.println("合格！！");
        }else {
            System.out.println("不合格。補修です。");
        }

    }

}
