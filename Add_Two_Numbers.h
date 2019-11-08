/**
Add Two Numbers
Medium
You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Example:
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        
        int listInteger1 = 0;
        int listInteger2 = 0;
        
        //TODO: ok so l1 is the head node, find a way to loop thru till the current node next == null
        // for ( int n = 0; l1->next != null; n++){
        //     listInteger1 += pow (l1.val(n), n)
        // }
        
        //loop for second list
        
        
        int final_integer = listInteger1 + listInteger2;
        return convertIntegerToList(final_integer);
    }
};

    //TODO: i need to better learn the properties of list 
    ListNode* convertIntegerToList(int value) {
        
        ListNode* list = new ListNode(0); 
  
        int dig = 0;
        while ( value != 0 ){
            
            dig = value % 10;
            
            // put in the data  
            //new_node->val = dig;  
            
            value = value /10
            
        }
        
        return list;
    }