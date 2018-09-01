package com.example.chalam.multiplerecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction

var fragmentClass:FragmentClass = FragmentClass()
var fragmentClass2:FragmentClass2 = FragmentClass2()
var fragmentClass3:FragmentClass3 = FragmentClass3()
var fragmentClass4:FragmentClass4 = FragmentClass4()
var fragmentClass5:FragmentClass5 = FragmentClass5()

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null) {
            var fm: FragmentManager = supportFragmentManager
            var tx: FragmentTransaction = fm.beginTransaction()
            tx.add(R.id.fragment, fragmentClass)
            tx.add(R.id.fragment2, fragmentClass2)
            tx.add(R.id.fragment3, fragmentClass3)
            tx.add(R.id.fragment4, fragmentClass4)
            tx.add(R.id.fragment5, fragmentClass5)
            tx.commit()
        }
    }
}
