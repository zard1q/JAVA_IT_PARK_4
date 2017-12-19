package ru.itpark;

import java.util.Iterator;

public class Set<V> {
    private static class SetNode<Value> {
        Value value;
        SetNode<Value> next;

        public SetNode(Value value) {
            this.value = value;
        }
    }
    private SetNode<V> values[];
    private int count;
    public Set() {
        this.values = new SetNode[10];
    }

    public void put(V value) {
        for (int i = 0; i < count; i++) {
            if (values[i].value.equals(value)) {
                return;
            }
        }
        SetNode<V> newSetNode = new SetNode<>(value);
        if(count < values.length-1) {
            values[count++] = newSetNode;
        } else {
            SetNode<V> temp[] = new SetNode[values.length*3/2+1];
            for(int i = 0; i < count; i++) {
                temp[i] = values[i];
            }
            values = temp;

        }

    }

    public void getValues() {
        for (int i = 0; i < count; i++) {
            System.out.println(values[i].value);
        }
    }






}


