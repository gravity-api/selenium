package com.thoughtworks.selenium.internal;

import com.thoughtworks.selenium.SeleniumException;

import java.util.Collections;
import java.util.List;

public class IndexFilterFunction implements FilterFunction {
    public List filterElements(List allElements, String filterValue) {
        try {
            int index = Integer.parseInt(filterValue);
            if (allElements.size() > index)
                return Collections.singletonList(allElements.get(index));
        } catch (NumberFormatException e) {
            // Handled below
        }

        throw new SeleniumException("Element with index " + filterValue + " not found");
    }
}
