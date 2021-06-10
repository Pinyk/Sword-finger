package 剑指offer.从尾到头打印链表;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: gaoyk
 * @Date: 2021/6/6 14:50
 * 可以使用栈结构，但是也可以不使用额外数组和栈空间 直接操作
 */

class ListNode {

    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

public class Demo {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p1 = new ListNode(3);
        ListNode p2 = new ListNode(2);
        head.next = p1;
        p1.next = p2;
        p2.next = null;
        int arr[] = reversePrint(head);
        for (int x : arr){
            System.out.print(x + " ");
        }
    }

    private static int[] reversePrint(ListNode head) {
        ListNode now = head;
        int count = 0;
        while(now != null){
            count++;
            now = now.next;
        }
        int arr[] = new int[count];
        count--;
        now = head;
        while(count >= 0 && now != null){
            arr[count] = now.val;
            count--;
            now = now.next;
        }
        return arr;
    }
}
