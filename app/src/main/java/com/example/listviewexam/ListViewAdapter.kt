package com.example.listviewexam

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val context: Context, var itemList: MutableList<ListViewItem>) : BaseAdapter() {

    //ListView에 속한 item의 전체 수를 반환한다.
    override fun getCount(): Int {
        return itemList.size
    }
    /*
    해당 위치의 item을 반환하는 메소드이다. Int 형식으로 된 position을 파라미터로 갖는다.
    예를 들어 1번째 Dog item을 선택하고 싶으면 코드에서 getItem(0)과 같이 쓸 수 있을 것이다.
    */
    override fun getItem(p0: Int): Any {
        return itemList[p0]
    }
    /*
    해당 위치의 item id를 반환하는 메소드이다.
     */
    override fun getItemId(p0: Int): Long {
        return 0
    }

    //xml 파일의 View와 데이터를 연결하는 핵심 역할을 하는 메소드이다.
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View = LayoutInflater.from(context).inflate(R.layout.item_view, null)

        val title = view.findViewById<TextView>(R.id.title)
        val content = view.findViewById<TextView>(R.id.content)

        val list = itemList[position]
        title.text = list.title
        content.text = list.content

        return view
    }

//    fun addItem(title: String?, content: String?) {
//        val item = ListViewItem("title", "content")
//
//        item.title = title
//        item.content = content
//
//        itemList.add(item)
//    }
}