package 剑指offer.用两个栈实现队列;

/**
 * @Author: gaoyk
 * @Date: 2021/6/7 18:25
 */
public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.appendTail(1);
        demo.appendTail(2);
        demo.appendTail(3);
        System.out.println(demo.deleteHead());
        demo.appendTail(3);
        System.out.println(demo.deleteHead());
        System.out.println(demo.deleteHead());
        System.out.println(demo.deleteHead());
        System.out.println(demo.deleteHead());
    }
}
