package com.example.chalam.multiplerecycle

import android.content.Context
import android.media.Image
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_indiv.view.*

class RecyclerAdapter:RecyclerView.Adapter<MyHolder> {
    var context:Context? = null

    var list:MutableList<String> = mutableListOf()
    var imageList = arrayOf<Int>(R.drawable.bridalbeauty,R.drawable.mehndi,R.drawable.prewedding,R.drawable.catering,R.drawable.hairstyle,R.drawable.marriage)
    constructor(context: Context)
    {
        this.context = context
        list.add("Bridal Beauty");list.add("Mehendhi");list.add("Pre Wedding")
        list.add("Catering");list.add("Hair Style");list.add("Marriage")
    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyHolder {

        var layoutInflater = LayoutInflater.from(context).inflate(R.layout.fragment_indiv,p0,false)
/*        var layoutInflater = LayoutInflater.from(context)
        layoutInflater.inflate(R.layout.fragment_indiv,p0,false)*/
        return MyHolder(layoutInflater)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(p0: MyHolder, p1: Int) {
        p0.textView!!.setText(list[p1])
        p0.imageView!!.setImageResource(imageList[p1])
    }
}
class MyHolder:RecyclerView.ViewHolder
{
    var textView:TextView? = null
    var imageView:ImageView? = null
    constructor(view: View) : super(view)
    {
       textView = view.textView
        imageView = view.imageView
    }
}