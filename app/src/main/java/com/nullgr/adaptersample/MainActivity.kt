package com.nullgr.adaptersample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.nullgr.dynamicadapter.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val baseAdapter = BaseAdapter(
                object : AdapterDelegatesFactory {
                    override fun createDelegate(clazz: Class<ListItem>): AdapterDelegate {
                        return when (clazz) {
                            LeftItem::class.java -> LeftItemDelegate()
                            RightItem::class.java -> RightItemDelegate()
                            else -> throw RuntimeException()
                        }
                    }
                },
                RxDifferenceCalculator())

        baseAdapter.updateData(data)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = baseAdapter
    }

    companion object {

        private val data = ArrayList<ListItem>()

        init {
            data.add(LeftItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(LeftItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
            data.add(RightItem(System.nanoTime()))
        }
    }

}
