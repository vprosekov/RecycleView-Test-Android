package com.sadcubeapps.recycleview_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val titlesList = mutableListOf<String>()
    private val descList = mutableListOf<String>()
    private val imagesList = mutableListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postToList()

        rv_recycleView.layoutManager = LinearLayoutManager(this)
        rv_recycleView.adapter = RecycleAdapter(titlesList, descList, imagesList)

    }
    private fun addToList(title: String, description: String, image: Int) {
        titlesList.add(title)
        descList.add(description)
        imagesList.add(image)

    }

    private fun postToList() {
        for (i in 1..25) {
            addToList("Title $i", "Description $i", R.mipmap.ic_launcher_round)
        }
    }
}