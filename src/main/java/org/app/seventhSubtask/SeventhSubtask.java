package org.app.seventhSubtask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;

public class SeventhSubtask {

    public SeventhSubtask() {

        ArrayList<Object> array = new ArrayList<>(){
            {
                add("VLADIK");
                add("RUYsraw");
                add(null);
                add("something");
            }
        };

        System.out.println("Initial array: " + array);
        System.out.println("Filtered array: " + filter(array.toArray(), Objects::nonNull));
    }

    private static <T> ArrayList<T> filter(T[] array, Function<? super T, Boolean> filter) {

        int offset = 0;

        for (int i = 0; i < array.length; i++) {
            if (!filter.apply(array[i])) {
                offset++;
            } else {
                array[i - offset] = array[i];
            }
        }

        // Arrays.copyOf копирует значение из массива array в новый массив
        // с длинной array.length - offset
        return new ArrayList<T>(Arrays.asList(Arrays.copyOf(array, array.length - offset)));
    }
}
