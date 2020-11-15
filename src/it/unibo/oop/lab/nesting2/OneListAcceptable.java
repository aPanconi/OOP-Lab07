package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
    
    private final List<T> list;

    public OneListAcceptable(List<T> list) {
	super();
	this.list = list;
    }

    @Override
    public Acceptor<T> acceptor() {
	final Iterator<T> listIterator = list.iterator();
	
	return new Acceptor<T>() {
	    @Override
	    public void accept(T newElement) throws ElementNotAcceptedException {
		try {
		    if (newElement.equals(listIterator.next())) {
			return;
		    }
		} catch (Exception e) {
		    System.out.println("No more element to be accepted");
		}
		throw new Acceptor.ElementNotAcceptedException(newElement);	
	    }

	    @Override
	    public void end() throws EndNotAcceptedException {
		try {
		    if (!listIterator.hasNext()) {
			return;
		    }
		} catch (Exception e) {
		    System.out.println("End not accepted");
		}
		throw new Acceptor.EndNotAcceptedException();
	    } 
	};
    }
}
