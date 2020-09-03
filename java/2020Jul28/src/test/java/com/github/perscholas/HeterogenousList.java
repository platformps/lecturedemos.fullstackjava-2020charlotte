package com.github.perscholas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by leon on 7/28/2020.
 */
public class HeterogenousList {
    @Test
    public void test() {
        List<Object> list = new ArrayList<>();
        list.add(10);
        list.add(new Date());
        list.add("Hello world");
        list.add(15.678);

        for (Object obj : list) {
            if (obj instanceof Date) {
                Date d = (Date) obj;
                boolean outcome = d.after(new Date());
            }

            if (obj instanceof Integer) {

            }
        }
    }
}
