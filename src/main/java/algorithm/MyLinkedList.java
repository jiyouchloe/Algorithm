package algorithm;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * MyLinkedList
 * 
 * <pre>
 * </pre>
 * 
 * @date 2018. 7. 2.
 * @author jiyou.chloe
 * @param <E>
 * 
 */
public class MyLinkedList<E> implements List<E> {

    private Node<E> head;

    private Node<E> tail;

    private int size;
    
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<String>();
        mll.test();
    }

    @SuppressWarnings("unchecked")
    private void test() {
        Node<String> node = new Node<String>("10");
        head = (Node<E>) node;
        tail = (Node<E>) node;
        
        print();
        
        node = new Node<String>("11");
        head.next = (Node<E>) node;
        tail = (Node<E>) node;
        
        print();
        
        node = new Node<String>("12");
        head.next.next = (Node<E>) node;
        tail = (Node<E>) node;
        
        print();
        
        head.next = head.next.next;
        print();
    }
    
    
    

    private void print() {
        Node<E> ptr = head;
        for ( ; ptr != null; ptr = ptr.next) {
            System.out.print(ptr.item + " -> ");
        }
        
        System.out.println();
    }

    static class Node<E> {
        E item;

        Node<E> next;

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }

        Node(E element) {
            this.item = element;
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     *  지정된 요소가 이 리스트에 포함되어 있는 경우에true를 돌려줍니다.
     */
    @Override
    public boolean contains(Object o) {
    	Node<E> ptr = head;
    	if(o != null){
    		for ( ; ptr != null; ptr = ptr.next) {
    			if(o.equals(ptr.item)){
    				return true;
    			}
    		}
    	} else {
    		for ( ; ptr != null; ptr = ptr.next) {
    			if(o == ptr.item){
    				return true;
    			}
    		}
    	}
        
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<E> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }

        @Override
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /**
     * toArray () 이 리스트내의 모든 요소를 적절한 순서로(최초의 요소로부터 마지막 요소에) 포함하고 있는 배열을 돌려줍니다.
     */
    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new IllegalStateException();
    }
    
    /**
	 * add (E e) 이 리스트의 마지막으로, 지정된 요소를 추가합니다.
	 */
    @Override
    public boolean add(E e) {
    	Node<E> addNode =  new Node<E>(e);
    	if(this.size == 0){
    		addNode.next = addNode;
    		this.head = addNode;
    		this.tail = this.head;
    	} else {
    		this.tail.next = addNode;
    		this.tail = addNode;
    	}
    	
    	this.size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new IllegalStateException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new IllegalStateException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new IllegalStateException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new IllegalStateException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new IllegalStateException();
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new IllegalStateException();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new IllegalStateException();
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
