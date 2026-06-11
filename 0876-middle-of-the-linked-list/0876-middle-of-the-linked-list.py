# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        current =  head
        length = 0
        
        while current != None:
            current = current.next
            length += 1
        
        mid = length // 2

        for i in range(mid):
            head = head.next

        return head




        