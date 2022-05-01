public class SingleLinkedList2 {
    Node2 head, tail;

    public boolean IsEmpty() {
        return head == null;
    }

    public void print() {
        if (!IsEmpty()) {
            Node2 tmp = head;
            System.out.print("Isi linked list\t: ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(String input) {
        Node2 ndInput = new Node2(input, null);
        if (IsEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(String input) {
        Node2 ndInput = new Node2(input, null);
        if (IsEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, String input) {
        Node2 ndInput = new Node2(input, null);
        Node2 temp = head;
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

    public void insertBefore(String key, String input) {
        Node2 ndInput = new Node2(input, null);
        Node2 temp = head;
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

    public void insertAt(int index, String input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node2 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node2(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public String getData(int index) {
        Node2 t = head;
        for (int i = 0; i < index; i++) {
            t = t.next;
        }
        return t.data;
    }

    public void getFrontData() {
        System.out.println("Antrian terdepan atas nama : "+head.data);
    }

    public void getLastData() {
        System.out.println("Antrian terbelakang atas nama : "+tail.data);
    }

    public int indexOf(String key) {
        Node2 t = head;
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
    
    public int indexOf2(String key) {
        Node2 t = head;
        int index, jml;
        index = 1;
        jml = 0;
        while (t != null && t.data != key) {
            t = t.next;
            index++;
            jml++;
        }
        if (t == null) {
            return index-jml;
        } else {
            return index-jml;
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
            Node2 t = head;
            while (t.next != tail) {
                t = t.next;
            }
            t.next = null;
            tail = t;
        }
    }

    public void remove(String key) {
        if (IsEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat menghapus");
        }else{
            Node2 t = head;
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
            Node2 t = head;
            for (int i = 0; i < index - 1; i++) {
                t = t.next;
            }t.next = t.next.next;
            if (t.next == null) {
                tail = t;
            }
        }
    }
}
