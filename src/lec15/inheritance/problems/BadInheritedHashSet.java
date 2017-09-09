package lec15.inheritance.problems;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

// Broken - Inappropriate use of inheritance!
public class BadInheritedHashSet<E> extends HashSet<E> {
	// The number of attempted element insertions
	private int addCount = 0;

	public BadInheritedHashSet() {
	}

	public BadInheritedHashSet(int initCap, float loadFactor) {
		super(initCap, loadFactor);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}
	
	
	public static void main(String[] args) {
	    BadInheritedHashSet<String> s = new BadInheritedHashSet<String>();
	    	    s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
	    	    
	    	    System.out.println(s.getAddCount());
	}
}