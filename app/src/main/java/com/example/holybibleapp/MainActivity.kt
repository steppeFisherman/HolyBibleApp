package com.example.holybibleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.holybibleapp.core.BibleApp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val viewModel = (application as BibleApp).mainViewModel
//
//        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
//       val adapter = BibleAdapter()
//       recyclerView.adapter = adapter
//
//        viewModel.observe(this, { adapter.update(it)
//        })
//        viewModel.fetchBooks()
   }
}