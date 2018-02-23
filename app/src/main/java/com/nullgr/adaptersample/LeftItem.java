package com.nullgr.adaptersample;

import com.nullgr.dynamicadapter.ListItem;


public class LeftItem extends ListItem {

    private final long value;

    public LeftItem(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }
}
