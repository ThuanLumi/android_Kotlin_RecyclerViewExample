package com.example.recyclerviewtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtest.adapter.ItemAdapter
import com.example.recyclerviewtest.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = DataSource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
//        recyclerView.adapter = ItemAdapter(this, myDataset)
//        recyclerView.setHasFixedSize(true)

        recyclerView.apply {
            adapter = ItemAdapter(this@MainActivity, myDataset)
            setHasFixedSize(true)
        }
    }
}