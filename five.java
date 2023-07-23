import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeAndSortLinkedList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        }

        if (l2 != null) {
            current.next = l2;
        }

        return dummy.next;
    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        return mergeTwoLists(left, right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of Linked-List-1 (separated by spaces):");
        ListNode list1 = createLinkedList(scanner);

        System.out.println("Enter the elements of Linked-List-2 (separated by spaces):");
        ListNode list2 = createLinkedList(scanner);

        System.out.println("Linked-List-1: ");
        printLinkedList(list1);

        System.out.println("Linked-List-2: ");
        printLinkedList(list2);

        ListNode merged = mergeTwoLists(list1, list2);
        ListNode sorted = sortList(merged);

        System.out.println("Output: ");
        printLinkedList(sorted);
    }

    public static ListNode createLinkedList(Scanner scanner) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        String input = scanner.nextLine();
        String[] values = input.split(" ");

        for (String value : values) {
            int num = Integer.parseInt(value);
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}
