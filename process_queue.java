import java.util.Scanner;

class LinkedList {
    Node head = null;

    public static class Node {
        String processName;
        String processId;
        int priority;

        Node next;

        Node(String processName, String processId, int priority) {
            this.processName = processName;
            this.processId = processId;
            this.priority = priority;
            next = null;
        }

    }

    public static int process = 1;

    public static LinkedList addNode(LinkedList list, int priority) {
        Node n = new Node("Process " + process, "P" + process++, priority);
        if (list.head == null) {
            list.head = n;
        } else {
            Node runner = list.head;
            while (runner.next != null) {
                if (list.head.priority > priority) {
                    n.next = list.head.next;
                    list.head = n;
                    break;
                } else if (runner.next == null && runner.priority > priority) {
                    runner.next = n;
                    String temp = n.processId;
                    n.processId = runner.processId;
                    runner.processId = temp;
                    temp = n.processName;
                    n.processName = runner.processName;
                    runner.processName = temp;
                    break;
                } else if (runner.next != null && runner.next.priority > priority) {
                    n.next = runner.next.next;
                    runner.next.next = n;
                    break;
                }
            }
        }
        return list;
    }

    public static void printAll(LinkedList list) {
        Node runner = list.head;
        while (runner != null) {
            System.out.println("Process id: " + runner.processId + "\tProcess name: " + runner.processName
                    + "\tPriority: " + runner.priority);
            runner = runner.next;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList list = new LinkedList();

        do {
            // String processId = in.nextLine();
            // if (processId == "exit")
            // break;
            // String processName = in.nextLine;

            int priority = in.nextInt();
            if (priority == 99)
                break;
            list = addNode(list, priority);

        } while (true);
        printAll(list);
    }

}