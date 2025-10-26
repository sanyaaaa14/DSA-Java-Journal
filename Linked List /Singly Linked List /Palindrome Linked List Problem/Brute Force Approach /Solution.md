# Intuition
A linked list is a palindrome if the sequence of its node values reads the same forward and backward.  
To verify this, one simple approach is to extract the values of all nodes into a list or array,  
then check if that array is symmetric from both ends.

---

# Approach
1. **Traverse the linked list** and store all node values in a dynamic list (`ArrayList<Integer>`).  
2. **Convert the list to an array** for easier index-based access.  
3. **Compare elements** from the start and end of the array:
   - If at any point `arr[i] != arr[n - i - 1]`, return `false` (not a palindrome).
4. If all corresponding elements match, return `true`.

This approach uses extra space but is simple and clear.

---

# Complexity
- **Time complexity:** O(n)  
  - Traversing the linked list once takes O(n).  
  - Comparing elements also takes O(n).  
  - Total = O(n).
  
- **Space complexity:** O(n)  
  - We store all node values in an auxiliary list/array.

---

# Code
```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> temp = new ArrayList<>();
        ListNode curr = head;

        // Step 1: Store all node values
        while (curr != null) {
            temp.add(curr.val);
            curr = curr.next;
        }

        // Step 2: Convert to array
        int[] arr = new int[temp.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp.get(i);
        }

        // Step 3: Check palindrome
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}

