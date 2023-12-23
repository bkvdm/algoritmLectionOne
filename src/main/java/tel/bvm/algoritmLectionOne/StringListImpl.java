package tel.bvm.algoritmLectionOne;

import org.springframework.stereotype.Service;
import tel.bvm.algoritmLectionOne.Exception.ElementNotFoundException;
import tel.bvm.algoritmLectionOne.Exception.InvalidIndexException;
import tel.bvm.algoritmLectionOne.Exception.NullPointerItemException;
import tel.bvm.algoritmLectionOne.Exception.StorageIsFullException;

import java.util.Arrays;

@Service
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
//        validateItem(item);
//        validateSize();
        item = storage[size++];
        return item;
    }

    @Override
    public String add(int index, String item) {
        validateItem(item);
        validateSize();
        validateIndex(index);

        if (index == size) {
            item = storage[size++];
            return item;
        }

        System.arraycopy(storage, index, storage, index + 1, size - index);
        item = storage[index];
        size++;
        return item;
    }

    @Override
    public String set(int index, String item) {
        validateIndex(index);
        validateItem(item);
        item = storage[index];
        return item;
    }

    @Override
    public String remove(String item) {
        validateItem(item);

        int index = indexOf(item);
//        if (index == -1) {
//            throw new ElementNotFoundException();
//        }
//
////        if (index == size) {
////            storage[size--] = null;
////            return item;
////        }
//
//        if (index != size) {
//        System.arraycopy(storage, index + 1, storage, index, size - (index + 1));
//        }
//
//        size--;
        return remove(index);
    }

    @Override
    public String remove(int index) {
        validateIndex(index);
        String item = storage[index];

        if (index != size) {
            System.arraycopy(storage, index + 1, storage, index, size - (index + 1));
        }

        return item;
    }

    @Override
    public boolean contains(String item) {
        return indexOf(item) != -1;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            if (storage[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = size - 1; i >= 0; i--) {
            if (storage[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        return storage[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        return Arrays.equals(this.toArray(), otherList.toArray());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public String[] toArray() {
        return Arrays.copyOf(storage, size);
    }
}
