import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class NestedIterator implements Iterator<Integer> {
    // Stack to store the NestedInteger elements
    private Stack<NestedInteger> stack;

    public NestedIterator(List<NestedInteger> nestedList) {
        stack = new Stack<>();
        // Push elements from right to left so the first element is at the top
        prepareStack(nestedList);
    }

    @Override
    public Integer next() {
        // hasNext() guarantees that the top element is an integer
        return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        // Process the stack until the top element is a single integer
        while (!stack.isEmpty()) {
            NestedInteger curr = stack.peek();
            if (curr.isInteger()) {
                return true;
            }
            // If it's a list, pop it and push its contents from right to left
            stack.pop();
            prepareStack(curr.getList());
        }
        return false;
    }

    // Helper method to push list elements onto the stack in reverse order
    private void prepareStack(List<NestedInteger> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            stack.push(list.get(i));
        }
    }
}