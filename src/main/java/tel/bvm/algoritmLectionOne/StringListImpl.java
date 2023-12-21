package tel.bvm.algoritmLectionOne;

import tel.bvm.algoritmLectionOne.Exception.InvalidIndexException;
import tel.bvm.algoritmLectionOne.Exception.NullPointerItemException;
import tel.bvm.algoritmLectionOne.Exception.StorageIsFullException;

public class StringListImpl implements StringList {

    private final String[] storage;
    private int size;

    public StringListImpl() {
        storage = new String[10];
    }
    public StringListImpl(int initSize) {
        storage = new String[initSize];
    }

    private void validateItem(String item) {
        if (item == null) {
            throw new NullPointerItemException();
        }
    }

    private void validateSize() {
        if (size == storage.length) {
            throw new StorageIsFullException();
        }
    }

    private void validateIndex(int index) {
        if (index >= size) {
            throw new InvalidIndexException();
        }
    }



    @Override
    public String add(String item) {
        return null;
    }

    @Override
    public String add(int index, String item) {
        return null;
    }

    @Override
    public String set(int index, String item) {
        return null;
    }

    @Override
    public String remove(String item) {
        return null;
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public boolean contains(String item) {
        return false;
    }

    @Override
    public int indexOf(String item) {
        return 0;
    }

    @Override
    public int lastIndexOf(String item) {
        return 0;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String[] toArray() {
        return new String[0];
    }
}
