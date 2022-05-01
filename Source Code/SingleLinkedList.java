public class SingleLinkedList {
    Node head;
    Node tail;

    public boolean IsEmpty() {
        return head == null;
    }

    public void print() {
        if (!IsEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List\t: ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    public void addFirst(int input) {
        Node ndInput = new Node(input, null);
        if (IsEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (IsEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    // Source Code Tugas No.1
    public void insertBefore(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                ndInput.next = temp;
                if (ndInput.next == head) {
                    head = ndInput;
                    break;
                }
            }
            temp.next = temp;
        } while (temp != null);
    }

    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public int getData(int index) {
        Node t = head;
        for (int i = 0; i < index; i++) {
            t = t.next;
        }
        return t.data;
    }

    public int indexOf(int key) {
        Node t = head;
        int index = 0;
        while (t != null && t.data != key) {
            t = t.next;
            index++;
        }
        if (t == null) {
            return -1;
        }else {
            return index;
        }
    }

    public void removeFirst() {
        if (IsEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat menghapus");
        } else if (head == tail) {
            head = tail = null;
        }else{
            head = head.next;
        }
    }

    public void removeLast() {
        if (IsEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat menghapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node t = head;
            while (t.next != tail) {
                t = t.next;
            }
            t.next = null;
            tail = t;
        }
    }

    public void remove(int key) {
        if (IsEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat menghapus");
        }else{
            Node t = head;
            while (t != null) {
                if ((t.data == key) && (t == head)) {
                    this.removeFirst();
                    break;
                } else if (t.next.data == key){
                    t.next = t.next.next;
                    if (t.next == null) {
                        tail = t;
                    }break;
                }t = t.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node t = head;
            for (int i = 0; i < index - 1; i++) {
                t = t.next;
            }t.next = t.next.next;
            if (t.next == null) {
                tail = t;
            }
        }
    }
}