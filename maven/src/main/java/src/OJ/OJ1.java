package src.OJ;

public class OJ1 {

    public static void main(String[] args) {
        int inner = 1;
        int outer =3;
        int[] points_x = {0, 1, 2, -2, 3};
        int[] points_y = {0, 1, 4, 1, 0};
        int length = points_x.length;
        int correctPoint = 0;

        for (int i = 0; i <points_x.length ; i++) {

            boolean x = false;
            boolean y = false;
            boolean occur = false;
            if (Math.abs(points_x[i])>=inner&&Math.abs(points_x[i])>=outer){
                x = true;
            }
            if (Math.abs(points_y[i])>=inner&&Math.abs(points_y[i])>=outer){
                y = true;
            }
            //4 dead points
            boolean a = Math.abs(points_x[i])==0&&Math.abs(points_y[i])==inner;
            boolean b = Math.abs(points_x[i])==0&&Math.abs(points_y[i])==outer;
            boolean c = Math.abs(points_y[i])==0&&Math.abs(points_y[i])==inner;
            boolean d = Math.abs(points_y[i])==0&&Math.abs(points_y[i])==outer;
            if (!a&&!b&&!c&&!d){
                occur =true;
            }
            //1 alive point
            boolean A = Math.abs(points_x[i])==inner&&Math.abs(points_y[i])==inner;
            if (x&&y&&occur){
                correctPoint++;
            }
            if (A){
                correctPoint++;
            }
        }
        System.out.println(correctPoint);

    }



    public static int solution(int inner, int outer, int[] points_x, int[] points_y) {
        // write your code in Java SE 8
        //check x
        int length = points_x.length;
        int correctPoint = 0;

        for (int i = 0; i <points_x.length ; i++) {

            boolean x = false;
            boolean y = false;
            if (Math.abs(points_x[i])>inner&&Math.abs(points_x[i])>outer){
                x = true;
            }
            if (Math.abs(points_y[i])>inner&&Math.abs(points_y[i])>outer){
                y = true;
            }
            if (x&&y){
                correctPoint++;
            }
        }
        return correctPoint;
        //check y

    }

}
