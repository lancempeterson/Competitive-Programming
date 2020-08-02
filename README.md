# Competitive Programming
My solutions to various competitive programming problems. I work towards finding optimized solutions utilizing various algorithms and data structures.

---
__Competitive Programming Techniques__

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
* [Move Zeroes](https://leetcode.com/problems/move-zeroes/)

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
