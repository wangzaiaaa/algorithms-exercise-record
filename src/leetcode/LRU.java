package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LRU<K,V> {
    DLinkedNode head,tail;
    int size,capacity;
    Map<K,DLinkedNode> cache;
    private class DLinkedNode{
        K key;
        V value;
        DLinkedNode prev,next;
    }
    private void removeNode(DLinkedNode node){
        DLinkedNode prev = node.prev;
        DLinkedNode next = node.next;
        prev.next = next;
        next.prev = prev;
    }
    private void addNode(DLinkedNode node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    private void moveToFirst(DLinkedNode node){
        removeNode(node);
        addNode(node);
    }
    private DLinkedNode removeLastNode(){
        DLinkedNode node = tail.prev;
        removeNode(node);
        return node;
    }
    LRU(int capacity){
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
        cache = new HashMap<>();
        this.capacity = capacity;
        this.size = 0;
    }
    public V get(K key){
        DLinkedNode node = cache.get(key);
        if(node == null){
            return null;
        }
        moveToFirst(node);
        return node.value;
    }
    public void put(K key,V value){
        DLinkedNode node = cache.get(key);
        if(node == null){
            node = new DLinkedNode();
            node.key = key;
            node.value = value;
            cache.put(key,node);
            addNode(node);
            size++;
            if(size > capacity){
                DLinkedNode lastNode = removeLastNode();
                cache.remove(lastNode);
                size--;
            }
        }else{
            node.value = value;
            moveToFirst(node);
        }
    }

}
