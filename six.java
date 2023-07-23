import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class five {
    public static ListNode removeDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode current = head;
        while (current != null) {
            ListNode runner = current;
            while (runner.next != null) {
                if (runner.next.val == current.val) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of Linked-List (separated by spaces):");
        ListNode head = createLinkedList(scanner);

        System.out.println("Linked-List: ");
        printLinkedList(head);

        ListNode withoutDuplicates = removeDuplicates(head);

        System.out.println("Output: ");
        printLinkedList(withoutDuplicates);
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

    

