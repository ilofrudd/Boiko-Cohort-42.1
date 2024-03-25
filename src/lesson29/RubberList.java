package lesson29;

public class RubberList {
    private int size = 0;
    private Node first;
    private Node last;
    private int findIndex;

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int size() {
        return size;
    }

    public Integer get(int idx) {
        Node findNode = findByIndex(idx);
        if (findNode != null) {
            return findNode.item;
        }
        return null;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public int indexOf(int value) {
        Node node = findByValue(value);
        if (node != null) {
            return findIndex;
        }
        return -1;
    }

    public void add(int value) {
        if (size == 0) {
            first = new Node(null, value, null);
        } else if (size == 1) {
            last = new Node(first, value, null);
            first.next = last;
        } else {
            Node newLast = new Node(last, value, null);
            last.next = newLast;
            last = newLast;
        }
        size++;
    }

    public void add(int value, int idx) {
       //TODO
    }

    public void remove(int idx) {
        // remove first element;
        if (idx == 0) {
            if (size == 1) {
                first = null;
            } else {
                Node newFirst = first.next;
                newFirst.prev = null;
                first = newFirst;
            }
            size--;
            // remove last element
        } else if (idx == size - 1) {
            Node newLast = last.prev;
            newLast.next = null;
            last.prev = null;
            last = newLast;
            size--;
            // remove mid element
        } else {
            Node findNode = findByIndex(idx);
            if (findNode == null) {
                return;
            }
            Node nodeA = findNode.prev;
            Node nodeC = findNode.next;
            nodeA.next = nodeC;
            nodeC.prev = nodeA;
            findNode.next = null;
            findNode.prev = null;
            size--;
        }
    }

        @Override
        public String toString () {
            StringBuilder sb = new StringBuilder("[");
            if (size > 0) {
                sb.append(first.item);
            }
            if (size > 1) {
                Node cursor = first;
                while (cursor.next != null) {
                    cursor = cursor.next;
                    sb.append(", ").append(cursor.item);
                }
            }
            return sb.append("]").toString();
        }

        private Node findByValue (int value) {
            if (size == 0) {
                return null;
            }
            findIndex = 0;
            if (first.item == value) {
                return first;
            }
            Node cursor = first;
            while (cursor.next != null) {
                cursor = cursor.next;
                findIndex++;
                if (cursor.item == findIndex) {
                    return cursor;
                }
            }
            return null;
        }

        private Node findByIndex ( int idx){
            if (idx == 0) {
                return first;
            }
            if (idx == size - 1) {
                return last;
            }
            findIndex = 0;
            Node cursor = first;
            while (cursor.next != null) {
                cursor = cursor.next;
                findIndex++;
                if (idx == findIndex) {
                    return cursor;
                }
            }
            return null;
        }

        private static class Node {
            Node prev;
            int item;
            Node next;

            public Node(Node prev, int item, Node next) {
                this.prev = prev;
                this.item = item;
                this.next = next;
            }

            @Override
            public String toString() {
                return "Node{" +
                        "prev=" + (prev == null ? null : "<-link") +
                        ", item=" + item +
                        ", next=" + (next == null ? null : "link->") +
                        '}';
            }
        }
}
