
public class IfSample1 {

    public static void main(String[] args) {
        int score = 80;
        
        if (score == 100) {
            System.out.println("満点です！");
        }else if(score >= 80){
            System.out.println("良くできました！");
        }else if(score >= 60) {
            System.out.println("合格です！");
        }else {
            System.out.println("不合格です。補講を行います");
        }

    }

}
