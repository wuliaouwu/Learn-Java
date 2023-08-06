/**
* 测试Boolean类型使用*/
public class TestBoolean {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;

        if (b1){ //不推荐写b1==1，效果一样
            System.out.println("b1是true!");
        }else {
            System.out.println("b1是false!");
        }

    }

}
