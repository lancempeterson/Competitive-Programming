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
        
        unsigned long long int listInteger1 = 0;
        unsigned long long int listInteger2 = 0;
		ListNode* traversialPointer1 = l1;
		ListNode* traversialPointer2 = l2;
		
        //l1 is the head node, loop thru till the current node == null
		unsigned long long int multiplier = 1;
		while ( traversialPointer1 != NULL ) {
			listInteger1 += traversialPointer1->val * multiplier;
			multiplier *= 10;
			traversialPointer1 = traversialPointer1->next;
		}
		
		multiplier = 1;
		while ( traversialPointer2 != NULL ){
			listInteger2 += traversialPointer2->val * multiplier;
			multiplier *= 10;
			traversialPointer2 = traversialPointer2->next;
		}
		
        unsigned long long int final_integer = listInteger1 + listInteger2;
        if ( final_integer == 0 ) {
            ListNode* listZero = new ListNode(0);
            return listZero;
        }
        else {
            return convertIntegerToReverseList(final_integer);
        }
    }
private:
ListNode* convertIntegerToReverseList(unsigned long long int final_integer) {
		unsigned long long int value = final_integer;
        ListNode* headNode = NULL;
        int dig = 0;
        while ( value != 0 ) {
            dig = value % 10;
            ListNode* newNode = new ListNode(dig);
            if ( headNode == NULL ) {
                headNode = newNode;
            }
            else {
               ListNode* tempNode = headNode;
                while ( tempNode->next != NULL ) {
                    tempNode = tempNode->next;
                } 
                tempNode->next = newNode;
            }
            value = value /10;
        }
        return headNode;
    }
};


    