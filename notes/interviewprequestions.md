Note :: **The main difference between an Array and an ArrayList in Java is that an Array has a fixed size, while an ArrayList has a dynamic size.**

Array:
    Fixed size
    Can store primitive types and objects
    Faster performance
    Uses length to get size
ArrayList:
    Dynamic size (can grow/shrink)
    Stores only objects
    Provides built-in methods like add(), remove(), and size()
    Uses size() method to get size

###### **Q. How does ArrayList grow internally in Java?**
Answer:
  Internally, an ArrayList uses a dynamic array.
  When the array becomes full and a new element is added, Java creates a new larger array and copies old elements into it.

###### **Q. Why is random access fast in ArrayList?**
Answer:
    Random access is fast in ArrayList because it internally uses an array, and arrays store elements in contiguous memory locations.
    Using the index, Java can directly calculate the memory location of an element, so accessing an element takes constant time O(1).

###### **Q. Explain the difference between ArrayList and LinkedList in theory**
Answer:
    ArrayList and LinkedList are both classes of the List interface in Java, but their internal working is different.
    ArrayList: 
        ArrayList is internally implemented using a dynamic array.
        Elements are stored in contiguous memory locations, which makes random access very fast.
        Accessing elements using index is fast (O(1)).
        Insertion and deletion in the middle are slower because elements need to shift.
        Uses less memory compared to LinkedList.
        Best when data is mostly read/accessed.

    LinkedList:
        LinkedList is internally implemented using a doubly linked list.
        Each element (node) stores:
        data
        address of next node
        address of previous node
        Accessing elements is slower because traversal is required (O(n)).
        Insertion and deletion are faster because shifting is not needed.
        Uses more memory because each node stores extra pointers.
        Best when frequent insertion and deletion operations are needed.

**Q. Why is recursion related to stack?**
Answer:
    ---
    Every recursive function call is stored in stack memory.
    When a method calls itself:
    Java stores each call frame in stack
    After completion, frames are removed one by one

**Q. What happens when stack becomes empty and pop() is called?
Answer:
    Java throws: EmptyStackException

    

Note : INTERNAL WORLKING OF HASHMAP = >
Java HashMap `HashMap` is a data structure in Java that stores data in the form of key-value pairs and internally uses a hashing mechanism for fast data access. When we insert data using `put(key, value)`, the `HashMap` first generates a hash code for the key using the `hashCode()` method. This hash code is then processed to calculate a bucket index where the data will be stored. Internally, `HashMap` maintains an array of buckets, and each bucket can store one or more nodes. If multiple keys generate the same bucket index, a collision occurs. To handle collisions, Java uses a Linked List, and from Java 8 onward, if the number of entries in a bucket becomes large, the Linked List is converted into a Red-Black Tree to improve performance. When `get(key)` is called, the same hashing process is used to locate the bucket, and then the `equals()` method is used to find the exact key and return its value. In average cases, `HashMap` provides O(1) time complexity for insertion and retrieval operations, which makes it very fast and efficient. However, `HashMap` is not synchronized, so it is not thread-safe in multithreaded environments.
