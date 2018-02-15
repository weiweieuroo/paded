package com.example.weiweieuro.paded

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.item_child.view.*


class ChildCustomView@JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
) : FrameLayout(context,attrs,defStyleAttr) {
    lateinit var text : TextView
    init {
        LayoutInflater.from(context).inflate(R.layout.item_child,this,true)
        initinstance()
    }
    fun initinstance(){
        text = child
    }
    fun setC(i : Int){
        text.text = "${text.text}$i"
    }
}