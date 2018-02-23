package com.nullgr.adaptersample

import android.support.v7.widget.RecyclerView
import android.widget.TextView

import com.nullgr.dynamicadapter.AdapterDelegate
import com.nullgr.dynamicadapter.ListItem


internal class LeftItemDelegate : AdapterDelegate() {
    override val layoutResource: Int
        get() = R.layout.item_left_item

    override val itemType = LeftItem::class

    override fun onBindViewHolder(items: List<ListItem>, position: Int, vh: RecyclerView.ViewHolder) {
        val item = items[position] as LeftItem

        (vh.itemView.findViewById(R.id.message) as TextView).text = "left:" + item.value
    }
}
