package collection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ArrayList<E>
{
    private ArrayList<E> arrayList;
    public ArrayList()
    {
        arrayList = new ArrayList<E>();
    }
    public ArrayList(Collection<? extends E> c)
    {
        arrayList = new ArrayList<E>(c);
    }
    public ArrayList(int initialCapacity)
    {
        arrayList = new ArrayList<E>(initialCapacity);
    } 
    public boolean add(E e)
    {
        return arrayList.add(e);
    }
    public void add(int index, E element)
    {
        arrayList.add(index, element);
    }
    public boolean addAll(Collection<? extends E> c)
    {
        return arrayList.addAll(c);
    }
    public boolean addAll(int index, Collection<? extends E> c)
    {
        return arrayList.addAll(index, c);
    }
    public void clear()
    {
        arrayList.clear(); 
    }
 
    /* Returns a shallow copy of this ArrayList instance. */
    public Object clone()
    {
        return arrayList.clone();
    }
 
    /* Returns true if this list contains the specified element. */
    public boolean contains(Object o)
    {
        return arrayList.contains(o);
    }
    public void ensureCapacity(int minCapacity)
    {
        arrayList.ensureCapacity(minCapacity);
    }
 
    /* Returns the element at the specified position in this list. */
    public E get(int index)
    {
        return arrayList.get(index);
    }
 
    /*
     * Returns the index of the first occurrence of the specified element in
     * this list, or -1 if this list does not contain the element.
     */
    public int indexOf(Object o)
    {
        return arrayList.indexOf(o);
    }
 
    /* Returns true if this list contains no elements. */
    public boolean isEmpty()
    {
        return arrayList.isEmpty();
    }
 
    /* Returns an iterator over the elements in this list in proper sequence. */
    public Iterator<E> iterator()
    {
        return arrayList.iterator();
    }
 
    /*
     * Returns the index of the last occurrence of the specified element in this
     * list, or -1 if this list does not contain the element.
     */
    public int lastIndexOf(Object o)
    {
        return arrayList.lastIndexOf(o);
    }
    public ListIterator<E> listIterator()
    {
        return arrayList.listIterator();
    }
    public ListIterator<E> listIterator(int index)
    {
        return arrayList.listIterator(index);
    }
 
    /* Removes the element at the specified position in this list. */
    public E remove(int index)
    {
        return arrayList.remove(index);
    }
 
    /*
     * Removes the first occurrence of the specified element from this list, if
     * it is present.
     */
    public boolean remove(Object o)
    {
        return arrayList.remove(o);
    }
 
    /*
     * Removes from this list all of its elements that are contained in the
     * specified collection.
     */
    public boolean removeAll(Collection<?> c)
    {
        return arrayList.removeAll(c);
    }
 
    /*
     * Retains only the elements in this list that are contained in the
     * specified collection.
     */
    public boolean retainAll(Collection<?> c)
    {
        return arrayList.removeAll(c);
    }
    public E set(int index, E element)
    {
        return arrayList.set(index, element);
    }
    public int size()
    {
        return arrayList.size();
    }
    public List<E> subList(int fromIndex, int toIndex)
    {
        return arrayList.subList(fromIndex, toIndex);
    }
    public Object[] toArray()
    {
        return arrayList.toArray();
    }
    public <T> T[] toArray(T[] a)
    {
        return arrayList.toArray(a);
    }

    public void trimToSize()
    {
        arrayList.trimToSize();
    }
     public static void main(String... arg)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
 
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(3, 40);
        arrayList.add(-10);
 
        Set<Integer> addAll = new HashSet<Integer>();
        addAll.add(101);
        addAll.add(200);
        addAll.add(300);
        arrayList.addAll(addAll);
 
        Set<Integer> indexAddAll = new HashSet<Integer>();
        indexAddAll.add(101);
        indexAddAll.add(102);
        indexAddAll.add(103);
 
        arrayList.addAll(5, indexAddAll);
 
        if (arrayList.contains(101))
            System.out.println("the arrayList contains 101");
        else
            System.out.println("the arrayList does not contain 101");
 
        arrayList.ensureCapacity(15);
        System.out.println("the arrayList contains " + arrayList.get(5)+ " at index 5");
 
        System.out.println("the index of 101 is " + arrayList.indexOf(101));
        System.out.println("the elements of arrayList are");
        Iterator<Integer> itr = arrayList.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
 
        System.out.println("the last index of 101 is "+ arrayList.lastIndexOf(101));
        System.out.println("elements from index 3 are");
        ListIterator<Integer> listIterator = arrayList.listIterator(3);
        while (listIterator.hasNext())
        {
            System.out.print(listIterator.next() + "\t");
        }
        System.out.println();
        arrayList.remove(5);
 
        System.out.println("elements removed and retained");
        Set<Integer> removeAll = new HashSet<Integer>();
        removeAll.add(30);
        removeAll.add(300);
        removeAll.add(101);
 
        arrayList.removeAll(removeAll);
        Set<Integer> retainAll = new HashSet<Integer>();
        retainAll.add(10);
        retainAll.add(20);
        retainAll.add(200);
        retainAll.add(-10);
        retainAll.addAll(addAll);
 
        arrayList.retainAll(retainAll);
        arrayList.set(1, 101);
        System.out.println("the size of the arrayList is " + arrayList.size());
        System.out.println("the elements of the returned list are");
        List<Integer> list = arrayList.subList(0,1);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i) + "\t");
        }
        System.out.println();
        System.out.println("the elements of returned array are");
        Object[] array = (Object[]) arrayList.toArray();
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        arrayList.trimToSize();
        System.out.println("the size of the arrayList is " + arrayList.size());
        arrayList.clear();
        if (arrayList.isEmpty())
            System.out.println("the arrayList is empty");
        else
            System.out.println("the arrayList is not empty");
}
}