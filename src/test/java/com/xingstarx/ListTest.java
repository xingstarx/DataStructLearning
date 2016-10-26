package com.xingstarx;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ListTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ListTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(ListTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    /**
     * 测试单链表结构，并打印结果
     */
    public void testList() {
        int[] str = new int[]{1, 2, 3, 4, 5, 6};
        List list = new List(str);
        list.printList();
    }
}
