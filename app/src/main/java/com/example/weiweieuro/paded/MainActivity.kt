package com.example.weiweieuro.paded

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var list : RecyclerView
    lateinit var adapter: RecyclerView.Adapter<*>
    lateinit var mLayoutManager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list = my_list
        mLayoutManager = LinearLayoutManager(applicationContext)
        list.setLayoutManager(mLayoutManager)
        adapter = AdapterI(applicationContext)
        list.adapter = adapter
    }
}
