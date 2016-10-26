package com.xingstarx;


import org.junit.Test;

public class ListTest{


    /**
     * 测试单链表结构，并打印结果
     */
    @Test
    public void testList() {
        int[] str = new int[]{1, 2, 3, 4, 5, 6};
        List list = new List(str);
        list.printList();
    }
}
