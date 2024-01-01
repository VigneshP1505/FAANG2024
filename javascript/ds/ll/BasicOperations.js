class Node {
  constructor(data) {
    this.data = data;
    this.next = null;
  }
}

class LinkedList {
  constructor() {
    this.head = null;
    this.size = 0;
  }

  setHead(head, size) {
    this.head = head;
    this.size = size;
  }

  // add at th end of the list
  append(data) {
    const newNode = new Node(data);

    if (this.head === null) {
      this.head = newNode;
    } else {
      let currentNode = this.head;

      while (currentNode.next !== null) {
        currentNode = currentNode.next;
      }

      currentNode.next = newNode;
    }

    this.size++;
  }

  //add to the front
  prepend(data) {
    const newNode = new Node(data);

    if (this.head === null) {
      this.head = newNode;
    } else {
      newNode.next = this.head;
      this.head = newNode;
    }

    this.size++;
  }

  //delete first
  deleteFirst() {
    if (this.head === null) {
      throw new Error("No node to delete");
    }

    const deletedNode = this.head;

    this.head = this.head.next;
    this.size--;
    return deletedNode;
  }

  //delete end
  deleteEnd() {
    if (this.head === null) {
      throw new Error("No node to delete");
    }

    let currentNode = this.head;

    while (currentNode?.next?.next != null) {
      currentNode = currentNode.next;
    }

    currentNode.next = null;
    this.size--;
  }

  printList() {
    console.log("The list elements are:");
    let currentNode = this.head;

    while (currentNode != null) {
      console.log(currentNode.data);
      currentNode = currentNode.next;
    }
  }

  insertAt(data, index = 0) {
    if (index > this.size) {
      throw new Error("index greater than size.");
    }

    if (index < 0) {
      throw new Error("index less than 0");
    }

    const newNode = new Node(data);

    if (this.head === null) {
      this.head = newNode;
    } else {
      if (index === 0) {
        this.prepend(data);
      } else {
        let currentNode = this.head;
        let loopIndex = 0;

        while (currentNode.next != null && loopIndex < index - 1) {
          currentNode = currentNode.next;
          loopIndex++;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
      }
    }
    this.size++;
  }

  deleteAt(index) {
    if (index >= this.size) {
      throw new Error("index greater than size");
    }

    if (index < 0) {
      throw new Error("index less than 0");
    }

    if (index === 0) {
      this.deleteFirst();
    } else {
      let currentNode = this.head;
      let loopIndex = 0;
      while (currentNode.next != null && loopIndex < index - 1) {
        currentNode = currentNode.next;
        loopIndex++;
      }

      currentNode.next = currentNode.next?.next;
    }
    this.size--;
  }
}

// const ll = new LinkedList();

// ll.append(1);
// ll.append(2);
// ll.append(3);
// ll.append(5);

// ll.printList();

// ll.insertAt(4, 3);
// ll.printList();
// ll.deleteAt(3);
// ll.printList();

// const ll2 = new LinkedList();
// ll2.insertAt(4);

// ll2.printList();

module.exports = LinkedList;
