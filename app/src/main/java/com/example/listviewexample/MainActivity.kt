package com.example.listviewexample

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView1)
        listView.adapter = MyCustomAdapter(this)
    }

    private class MyCustomAdapter(context:Context):BaseAdapter(){
        private val mContext:Context
        init {
            mContext = context
        }

        override fun getItem(p0: Int): Any {
            return "TEST STRING"
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            val textView = TextView(mContext)
            textView.text = "Example"
            return textView
        }

        override fun getCount(): Int {
            return 7
        }
    }
}