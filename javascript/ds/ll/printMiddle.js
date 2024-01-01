const LinkedList = require("./BasicOperations");

function printMiddle(head) {
  if (!head) {
    throw new Error("no elements");
  }
  let fastP = head;
  let slowP = head;

  while (fastP?.next?.next) {
    fastP = fastP.next.next;
    slowP = slowP.next;
  }

  console.log("middle element", slowP.data);
  return slowP.data;
}

const ll = new LinkedList();
ll.append(1);
ll.append(2);
ll.append(3);
ll.append(4);

ll.printList();
printMiddle(ll.head);
ll.append(5);
printMiddle(ll.head);

const ll2 = new LinkedList();
ll2.append(1);

printMiddle(ll2.head);
