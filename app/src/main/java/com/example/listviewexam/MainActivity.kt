package com.example.listviewexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.listviewexam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val itemAdapter by lazy { ListViewAdapter(this, itemList) }


    var itemList = mutableListOf<ListViewItem>(
        ListViewItem("Hello", "World")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val listView : ListView = findViewById(R.id.list_view)
        binding.listView.adapter = itemAdapter



    }
}