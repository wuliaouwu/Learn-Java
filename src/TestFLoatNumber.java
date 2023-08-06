/**
* 测试浮点数的基本用法
*/

public class TestFLoatNumber {

    public static void main(String[] args) {
    double d1 = 3.14;
    double d2 = 3.14E2;

    //浮点数是不精确的，尽量不要直接比较
        float f2 = 0.1F;
        double d3 = 1.0/10;

        float f4 = 234324332432L;
        float f5 = f4+1;

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(f2==d3); //一个=是赋值，两个==是比较。
        System.out.println(f4==f5);



    }

}
