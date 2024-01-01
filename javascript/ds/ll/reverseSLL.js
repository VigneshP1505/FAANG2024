const LinkedList = require("./BasicOperations");

function reverse(ll) {
  let newHead = null;
  while (ll.head != null) {
    const deletedNode = ll.deleteFirst();
    if (!newHead) {
      newHead = deletedNode;
      deletedNode.next = null;
    } else {
      deletedNode.next = newHead;
      newHead = deletedNode;
    }
  }

  return newHead;
}

const ll = new LinkedList();
ll.append(1);
ll.append(2);
ll.append(3);
ll.append(4);

ll.printList();

const reversedListHead = reverse(ll);

ll.setHead(reversedListHead);

ll.printList();
