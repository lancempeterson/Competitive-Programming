# Competitive Programming

Table of Contents

- [My Solutions](#My-Solutions)
  * [120+ Solutions](#120+-Solutions)
- [Competitive Programming Techniques](#Competitive-Programming-Techniques)
  * [The Sliding Window](#The-Sliding-Window)
  * [Fast and Slow Pointers](#Fast-and-Slow-Pointers)
  * [2 Pointers](#2-Pointers)
  * [Modified Binary Search](#Modified-Binary-Search)
  * [Depth First Search](#Depth-First-Search)
  * [Breadth First Search](#Breadth-First-Search)
  * [Linked List Reversal](#Linked-List-Reversal)
  * [Dynamic Programming](#Dynamic-Programming)
  * [Backtracking](#Backtracking)
  * [Greedy Algorithms](#Greedy-Algorithms)
- [Competitive Programming Problem Types](#Competitive-Programming-Problem-Types)
  * [Array](#Array)
  * [Binary](#Binary)
  * [String](#String)
  * [Linked List](#Linked-List)
  * [Tree](#Tree)
  * [Dynamic Programming](#Dynamic-Programming)
  * [Matrix](#Array)
  * [Graph](#Graph)
  * [Interval](#Interval)

## My Solutions

My solutions to various competitive programming problems. I work towards finding optimized solutions utilizing various algorithms and data structures.

### 120+ Solutions

[View My 120+ Solutions!](https://github.com/lancempeterson/Competitive-Programming/tree/master/Coding%20Problems%20%26%20My%20Solutions)

## Competitive Programming Techniques

There are serveral competive prommaging techigues and patterns we can apply to
solve coding challenges.

### The Sliding Window

Many competitive programming questions can be easily solved using the
sliding window technique. This technique uses two pointers, a and b to create a
window that passes through a linear data structure, such as an array or linked
list. Both pointers usually start at the beginning, and move through our data
structure towards the end. In most cases the loop will end when pointer b reaches
the end. Sometimes the window size remains constant,
but often it will grow and shrink.
<br>
<br>
Clues for identifying this pattern.
* The problem input is a linear data structure such as a string, array, or linked list.
* You're asked to find the longest/shortest substring, subarray, or a desired value.

Examples:
* [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
* [Fruit Into Baskets](https://leetcode.com/problems/fruit-into-baskets/)
* [Move Zeroes](https://github.com/lancempeterson/Competitive-Programming/tree/master/Coding%20Problems%20%26%20My%20Solutions/Move%20Zeroes)

### Fast and Slow Pointers

There are several competitive programming questions that can be solved using the
Fast/Slow Pointers technique. Fast/Slow Pointers is a technique that uses two
pointers, denoted fast and slow.
The pointers usually start at the same point, with the fast pointer moving twice
as fast as the slow pointer. This technique is also called the Tortoise and the
Hare and is used in Floyd's cycle detection algorithm. The idea is to move the
pointers through our data structure and exit the loop when the fast pointer reaches the
end. We know that if the slow pointer is ever equal to the fast pointer, a cycle
exists. This pattern can be used to detect loops, determine the position of a
certain element, or find the overall length of a linked list.
<br>
<br>
Clues for identifying this pattern.
* The problem involves a loop in a linked list or array
* If we want to find the position of a certain element or find the length of the linked list.

Examples:
* [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)
* [Happy Number](https://leetcode.com/problems/happy-number/)

### 2 Pointers

### Modified Binary Search

Clues for identifying this pattern.
* Problem involves a sorted array.
* Problem asks for solution in Log N time.

### Depth First Search

### Breadth First Search

### Linked List Reversal

### Dynamic Programming

### Backtracking

### Greedy Algorithms

Clues for identifying this pattern.
* An array problem where they want an O(N) runtime and constant O(1) space.

## Competitive Programming Problem Types

Categories of Competitive Programming problem types.

### Array

### Binary

### String

### Linked List

### Tree

### Heap

### Dynamic Programming

### Matrix

### Graph

### Interval

<!-- __Competitive Programming Techniques__

**1) The Sliding Window**

Many competitive programming questions can be easily solved using the
sliding window technique. This technique uses two pointers, a and b to create a
window that passes through a linear data structure, such as an array or linked
list. Both pointers usually start at the beginning, and move through our data
structure towards the end. In most cases the loop will end when pointer b reaches
the end. Sometimes the window size remains constant,
but often it will grow and shrink.
<br>
<br>
Clues for identifying this pattern.
* The problem input is a linear data structure such as a string, array, or linked list.
* You're asked to find the longest/shortest substring, subarray, or a desired value.

Examples:
* [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
* [Fruit Into Baskets](https://leetcode.com/problems/fruit-into-baskets/)
* [Move Zeroes](https://github.com/lancempeterson/Competitive-Programming/tree/master/Coding%20Problems%20%26%20My%20Solutions/Move%20Zeroes)

**2) Fast/Slow Pointers**

There are several competitive programming questions that can be solved using the
Fast/Slow Pointers technique. Fast/Slow Pointers is a technique that uses two
pointers, denoted fast and slow.
The pointers usually start at the same point, with the fast pointer moving twice
as fast as the slow pointer. This technique is also called the Tortoise and the
Hare and is used in Floyd's cycle detection algorithm. The idea is to move the
pointers through our data structure and exit the loop when the fast pointer reaches the
end. We know that if the slow pointer is ever equal to the fast pointer, a cycle
exists. This pattern can be used to detect loops, determine the position of a
certain element, or find the overall length of a linked list.
<br>
<br>
Clues for identifying this pattern.
* The problem involves a loop in a linked list or array
* If we want to find the position of a certain element or find the length of the linked list.

Examples:
* [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)
* [Happy Number](https://leetcode.com/problems/happy-number/)

**3) 2 Pointers**

**4) Modified Binary Search**

Clues for identifying this pattern.
* Problem involves a sorted array.
* Problem asks for solution in Log N time.

**5) Depth First Search**

**6) Breadth First Search**

**7) Linked List Reversal**

**8) Dynamic Programming**

**9) Backtracking**

**10) Greedy Algorithms**

Clues for identifying this pattern.
* An array problem where they want an O(N) runtime and constant O(1) space.

---

__Competitive Programming Problem Types__

**1) Binary**

**2) Array**

**3) String**

**4) Linked List**

**5) Tree**

**6) Heap**

**7) Dynamic Programming**

**8) Matrix**

**9) Graph**

**10) Interval** -->
