package com.nullgr.adaptersample

import android.support.v7.widget.RecyclerView
import android.widget.TextView

import com.nullgr.dynamicadapter.AdapterDelegate
import com.nullgr.dynamicadapter.ListItem


internal class RightItemDelegate : AdapterDelegate() {

    override val layoutResource: Int
        get() = R.layout.item_right_item

    override val itemType = RightItem::class

    override fun onBindViewHolder(items: List<ListItem>, position: Int, vh: RecyclerView.ViewHolder) {
        val item = items[position] as RightItem

        (vh.itemView.findViewById(R.id.message) as TextView).text = "right:" + item.value
    }
}
