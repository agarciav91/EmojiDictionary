package com.example.emojidictionary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var layoutManager : GridLayoutManager
    lateinit var adapter : EmojiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Layout Manager
        layoutManager = GridLayoutManager(this, 3)
        recyclerView.layoutManager = layoutManager

        // Adapter
        adapter = EmojiAdapter(arrayListOf("💰", "🥶", "👺", "🔪", "🔫"))
        recyclerView.adapter = adapter
    }
}
