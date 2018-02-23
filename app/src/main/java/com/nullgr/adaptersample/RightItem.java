package com.nullgr.adaptersample;

import com.nullgr.dynamicadapter.ListItem;


public class RightItem extends ListItem {

    private final long value;

    public RightItem(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }
}
