package com.nullgr.dynamicadapter


/**
 * author a.komarovskyi
 */
class ItemsAdapter(delegatesFactory: AdapterDelegatesFactory,
                   differenceCalculator: RxDifferenceCalculator)
    : BaseAdapter(delegatesFactory, differenceCalculator) {
}