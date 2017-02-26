package com.kentama7.listutil;

import java.util.List;

public class ListUtil {

    public static <T> List<T> subList(List<T> list, int index, int offset) {
        if (list == null || list.size() < 1) {
            return list;
        }

        return list.subList(Math.max(0, index - offset), Math.min(list.size(), index + offset + 1));
    }
}
