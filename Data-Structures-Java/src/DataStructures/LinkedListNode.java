package DataStructures;

/*
 * Package-level access was deliberate.
 */
class LinkedListNode<T> {
  final T item;
  LinkedListNode<T> next;

  public LinkedListNode(T item) {
    this.item = item;
  }

  public T getItem() {
    return item;
  }

  public LinkedListNode<T> getNext() {
    return next;
  }

  public void setNext(LinkedListNode<T> next) {
    this.next = next;
  }
}
