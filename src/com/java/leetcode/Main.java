package com.java.leetcode;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Tag_Array array = new Tag_Array();
        Tag_LinkedList linkedList = new Tag_LinkedList();
        Tag_Queue queue = new Tag_Queue();
        Tag_Stack stack = new Tag_Stack();
        Tag_Greedy greedy = new Tag_Greedy();
        Tag_String str = new Tag_String();
        Tag_Math math = new Tag_Math();
        Tag_DP dp = new Tag_DP();
        Tag_Bitwise bit = new Tag_Bitwise();
        Tag_BinarySearch binarySearch = new Tag_BinarySearch();
        Tag_BackTracking backTracking = new Tag_BackTracking();
        Tag_BinaryTree binaryTree = new Tag_BinaryTree();
        Tag_DFS dfs = new Tag_DFS();
        Tag_BFS bfs = new Tag_BFS();
        Tag_Sort sort = new Tag_Sort();
        LeetcodeWeeklyContest contest = new LeetcodeWeeklyContest();
        LRUCache cache = new LRUCache(2);

        System.out.println(dp.longestPalindrome("abc"));
    }
}

