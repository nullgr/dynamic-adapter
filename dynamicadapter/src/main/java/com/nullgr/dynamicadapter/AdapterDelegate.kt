package com.nullgr.dynamicadapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * author a.komarovskyi
 */
abstract class AdapterDelegate {

    abstract val layoutResource: Int

    abstract val itemType: Any

    fun isForViewType(items: List<ListItem>, position: Int): Boolean =
            items[position]::class == itemType

    open fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder =
            BaseViewHolder(parent, layoutResource)

    abstract fun onBindViewHolder(items: List<ListItem>,
                                  position: Int,
                                  vh: RecyclerView.ViewHolder)

    open fun onBindViewHolder(items: List<ListItem>,
                              position: Int,
                              holder: RecyclerView.ViewHolder,
                              payloads: List<Any>) {
    }

    open fun onViewRecycled(holder: RecyclerView.ViewHolder) {}

    open fun onFailedToRecycleView(holder: RecyclerView.ViewHolder): Boolean {
        return false
    }

    open fun onViewAttachedToWindow(holder: RecyclerView.ViewHolder) {}

    open fun onViewDetachedFromWindow(holder: RecyclerView.ViewHolder) {}
}
