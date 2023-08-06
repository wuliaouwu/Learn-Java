public class TestConstant {

    public static void main(String[] args) {

        final double PI = 3.14;
        //PI = 3.1415; //无法为常量再次分配值
        final int NIAN = 2023;
        //常量通常用大写字母命名

        int r = 4;
        double area = PI*r*r;
        double circle = 2*PI*r;

        System.out.println("面积是："+area);

        System.out.println("周长是："+circle);

        System.out.println(PI+NIAN);

    }

}
