package HackerRank.interviewKit.stack;

/**
 *
 * @Author : Rutul Darji
 * @Description : Make stack that work with middle element of that.. use Double LinkedList
 * */
public class StackWithMidOperationSupport {

    // double LinkedList
    class DDLNode {
        DDLNode prev;
        DDLNode next;
        int data;

        DDLNode(int data) {
            this.data = data;
        }
    }

    class SpecialStack {
        DDLNode mid;
        DDLNode head;
        int count;
    }

    SpecialStack createNewStack() {
        SpecialStack specialStack = new SpecialStack();
        specialStack.count = 0;
        return specialStack;
    }

    void push(SpecialStack stack, int data) {

        // make node
        DDLNode newNode = new DDLNode(data);

        // always add to top so prev is always null;
        newNode.prev = null;
        newNode.next = stack.head;

        stack.count++;

        if (stack.count == 1) {
            stack.mid = newNode;
        } else {
            // few node already exist
            stack.head.prev = newNode;

            if (stack.count%2!=0) {
                // mid move further
                stack.mid = stack.mid.prev;
            }
        }
        stack.head = newNode;
    }

    int pop(SpecialStack stack) {
        handleEmptyStack(stack);
        DDLNode ddlNode = stack.head;
        int data = ddlNode.data;
        stack.head = ddlNode.next;
        stack.count--;

        if (stack.head!=null) {
            stack.head.prev = null;
        }

        // make it available for GC
        ddlNode.next = null;
        ddlNode.prev = null;
        ddlNode = null;

        if (stack.count %2 == 0) {
            stack.mid = stack.mid.next;
        }
        return data;
    }

    int peek(SpecialStack stack) {
        handleEmptyStack(stack);
        return stack.head.data;
    }

    int getMiddleElement(SpecialStack stack) {
        handleEmptyStack(stack);
        return stack.mid.data;
    }

    private void handleEmptyStack(SpecialStack stack) {
        if (stack.count == 0) {
            throw new RuntimeException("Stack is empty");
        }
    }

    public static void main(String[] args) {
        StackWithMidOperationSupport ob = new StackWithMidOperationSupport();
        SpecialStack stack = ob.createNewStack();
        ob.push(stack, 11);
        ob.push(stack, 22);
        ob.push(stack, 33);
        ob.push(stack, 44);
        ob.push(stack, 55);
        ob.push(stack, 66);
        ob.push(stack, 77);

        System.out.println("Item popped is " + ob.pop(stack));
        System.out.println("Item popped is " + ob.pop(stack));
        System.out.println("Peek element is " + ob.peek(stack));
        System.out.println("Middle Element is " + ob.getMiddleElement(stack));
    }




}
