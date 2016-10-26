package com.xingstarx;

/**
 * Created by xiongxingxing on 16/10/26.
 * 单链表结构（头指针也要存放值）
 */

public class List {
    private Node header;

    /**
     * 传入一个字符串数组来构造list
     * @param datas
     */
    public List(int[] datas) {
        header = new Node();
        Node temp = header;
        for (int i = 0; i < datas.length; i++) {
            if (i == 0) {
                header.setData(datas[i]);
            } else {
                Node next = new Node();
                next.setData(datas[i]);
                temp.setNext(next);
                temp = next;
            }
        }
    }

    public List() {
        header = new Node();
    }

    public Node getHeader() {
        return header;
    }

    public void setHeader(Node header) {
        this.header = header;
    }

    /**
     * 打印链表数据
     */
    public void printList() {
        printList(header);
    }

    /**
     * 内部方法，先判断header头指针是否有next节点，如果没有那么就不打印，后续的判断当前Node节点是否为null，不为null说明有数据
     * @param node
     */
    private void printList(Node node) {
        while (header.getNext() != null && node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    /**
     * 遍历链表，得到链表中的最大值
     * @return
     */
    public int getMaxValue() {
        return 0;
    }

}
