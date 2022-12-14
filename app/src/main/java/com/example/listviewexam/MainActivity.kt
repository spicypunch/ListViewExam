package com.example.listviewexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var itemList = mutableListOf<ListViewItem>(
        ListViewItem("Hello", "World")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemAdapter = ListViewAdapter(this, itemList)
        val listView : ListView = findViewById(R.id.list_view)
        listView.adapter = itemAdapter
    }
}