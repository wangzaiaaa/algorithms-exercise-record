package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private DListNode head,tail;
    private int size,capacity;
    private Map<Integer,DListNode> map;
    class DListNode{
        int key,value;
        DListNode prev,next;
        DListNode(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    private void removeNode(DListNode node){
        DListNode prev = node.prev;
        DListNode next = node.next;
        prev.next = next;
        next.prev = prev;
    }
    private void addNode(DListNode node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    private DListNode removeLastNode(){
        DListNode node = tail.prev;
        removeNode(node);
        return node;
    }
    private void moveToFirst(DListNode node){
        removeNode(node);
        addNode(node);
    }
    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.size = 0;
        this.capacity = capacity;
        head = new DListNode(-1,-1);
        tail = new DListNode(-1,-1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DListNode node = map.get(key);
        if(node == null){
            return -1;
        }
        moveToFirst(node);
        return node.value;
    }

    public void put(int key, int value) {
        DListNode node = map.get(key);
        if(node == null){
            node = new DListNode(key,value);
            map.put(key,node);
            addNode(node);
            size++;
            if(size > capacity){
                DListNode revomedNode = removeLastNode();
                map.remove(revomedNode.key);
                size--;
            }
        }else{
            node.value = value;
            moveToFirst(node);
        }

    }
}
