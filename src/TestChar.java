/**
* 测试char类型的使用
*/

public class TestChar {

    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '中';
        char c3 = '\u0061';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        String str = "我爱中国";
        System.out.println(str);

        char c5 = '\n';
        System.out.println("a\n\"b\"\nc\n\'e\'\n\\f\ng");
        System.out.println("o\\tp\\tq\\tr\\ts\\tt");
    }

}
