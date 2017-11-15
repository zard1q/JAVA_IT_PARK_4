
package ru.itpark;

public interface List<T> extends Iterable {
    /**
     * Добавление в конец
     * @param element
     */
    void add(Object element);

    void addToBegin(Object object);

    Object get(int index);

    void remove(Object object);

    int indexOf(Object object);

    int size();
}