package com.xingstarx;

/**
 * Created by xiongxingxing on 16/10/26.
 * 封装的节点结构
 */

public class Node {
    private int data;
    private Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
