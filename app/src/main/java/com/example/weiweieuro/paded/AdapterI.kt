package com.example.weiweieuro.paded

import android.content.Context

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.item_parent.view.*


class AdapterI( mContext: Context) : RecyclerView.Adapter<AdapterI.ViewHolder>() {

    var context = mContext


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
         var btn : TextView = view.button_add
         var areaX : LinearLayout = view.area
         var count : Int = 1

        fun setClick(c : Context){
            btn.setOnClickListener {
                var tmp = ChildCustomView(c)
                tmp.setC(count++)
                tmp.setOnClickListener {
                    Toast.makeText(c,"I,m ${tmp.text.text}",Toast.LENGTH_SHORT).show()
                }
                areaX.addView(tmp)
            }
        }


        }
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
                holder!!.setClick(context)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context)
                .inflate(R.layout.item_parent, parent, false)
        return  ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }
    }



