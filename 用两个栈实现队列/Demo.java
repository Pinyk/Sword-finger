package 剑指offer.用两个栈实现队列;

import java.util.LinkedList;

/**
 * @Author: gaoyk
 * @Date: 2021/6/7 17:58
 * 维护两个栈
 * 添加元素时候直接向第一个栈添加元素
 * 在删除元素和取顶部元素时候
 * 如果栈2不为空，直接出栈栈2，如果栈2为空先将栈1中所有元素压入栈2，再进行取栈2栈顶操作
 */
public class Demo {
    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;

    public Demo() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty())
                return -1;
            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
            return stack2.pop();
        } else {
            return stack2.pop();
        }
    }
}
