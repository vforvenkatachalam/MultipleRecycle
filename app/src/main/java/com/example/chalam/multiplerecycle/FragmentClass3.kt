package com.example.chalam.multiplerecycle

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment2_layout.view.*
import kotlinx.android.synthetic.main.fragment3_layout.view.*
import kotlinx.android.synthetic.main.fragment_layout.view.*

class FragmentClass3:Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view:View = inflater.inflate(R.layout.fragment3_layout,container,false)

        view.recyclerView3.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
        view.recyclerView3.adapter = RecyclerAdapter(context!!)
        return view
    }
}