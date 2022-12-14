package com.example.listviewexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.listviewexam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var count: Int = 0

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val itemAdapter by lazy { ListViewAdapter(this, itemList) }


    var itemList = mutableListOf<ListViewItem>(
        ListViewItem("Hello", "World")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.plusBtn.setOnClickListener {
            addList()
        }

        binding.minusBtn.setOnClickListener {
            removeList()
        }
    }

    private fun addList() {
        count++
        itemList.add(ListViewItem("$count", "$count"))
        Log.e("list", itemList.toString())
        binding.listView.adapter = itemAdapter
    }

    private fun removeList() {
        if (count != 0) {
            itemList.removeAt(count--)
            Log.e("list", itemList.toString())
            binding.listView.adapter = itemAdapter
        }

    }
}