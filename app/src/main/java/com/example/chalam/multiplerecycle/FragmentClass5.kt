package com.example.chalam.multiplerecycle

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment5_layout.view.*

class FragmentClass5:Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view:View = inflater.inflate(R.layout.fragment5_layout,container,false)

        view.recyclerView5.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
        view.recyclerView5.adapter = RecyclerAdapter(context!!)
        return view
    }
}