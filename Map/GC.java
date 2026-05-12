package Map;
import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
        phone p1 = new phone("iphone", 70000);
        System.out.println("strong refrence object :=>  "+p1);
        p1 = null;
        System.out.println("Strong refrence object :=> "+p1);
        WeakReference<phone> weakreference = new WeakReference<>(new phone("iphone", 70000));
        System.out.println("weak refrence object :=> "+weakreference.get());
        System.gc();
        System.out.println("weak reference object :=> "+weakreference.get());
    }

}
class phone {
private String name;
private int price;
    public phone(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "phone [name=" + name + ", price=" + price + "]";
    }
    
}


// about it 
// This code demonstrates the difference between strong and weak references in Java using Garbage Collection. A strong reference object remains in memory until its reference becomes null, while a weak reference object can be removed automatically by the Garbage Collector when System.gc() is called. The example shows that after garbage collection, the weakly referenced phone object may become null, proving that weak references do not prevent object cleanup.