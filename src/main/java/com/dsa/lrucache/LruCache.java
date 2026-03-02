package com.dsa.lrucache;

import java.util.HashMap;
import java.util.Map;

public class LruCache {
    Map<Integer, Node> lruCache;
    int capacity;
    Node head;
    Node tail;

    // Constructor to initialize the cache with a given
    // capacity
    LruCache(int capacity) {
        this.capacity = capacity;
        this.lruCache = new HashMap<>();
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public static void main(String[] args) {
        LruCache cache = new LruCache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
        cache.put(4, 4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }

    void put(int key, int value) {
        if (lruCache.containsKey(key)) {
            Node oldNode = lruCache.get(key);
            remove(oldNode);
        }

        Node node = new Node(key, value);
        lruCache.put(key, node);
        add(node);

        if (lruCache.size() > capacity) {
            Node nodeToDelete = tail.prev;
            remove(nodeToDelete);
            lruCache.remove(nodeToDelete.key);
        }
    }

    // Add a node right after the head (most recently used
    // position)
    private void add(Node node) {
        Node nextNode = head.next;
        head.next = node;
        node.prev = head;
        node.next = nextNode;
        nextNode.prev = node;
    }

    // Remove a node from the list
    private void remove(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    int get(int key) {
        if (!lruCache.containsKey(key)) {
            return -1;
        }

        Node node = lruCache.get(key);
        remove(node);
        add(node);
        return node.value;
    }

    class Node {
        int key;
        int value;
        Node next;
        Node prev;


        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }

    }
}
