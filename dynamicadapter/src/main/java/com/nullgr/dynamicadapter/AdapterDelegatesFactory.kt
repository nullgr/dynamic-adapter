package com.nullgr.dynamicadapter

/**
 * author a.komarovskyi
 */
interface AdapterDelegatesFactory {
    fun createDelegate(clazz: Class<ListItem>): AdapterDelegate
}