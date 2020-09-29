package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val category = listOf("تم الالغاء", "تم القبول", "قيد الانتظار")
    var adapter = RecyclerAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showCategoryInTab(category)
        main_rv.adapter = adapter

        main_mine_tv.setOnClickListener {
            main_mine_tv.setBackgroundResource(R.drawable.timeline_text_background)
            main_other_tv.setBackgroundResource(R.drawable.timeline_tv_unselect_bg)
        }

        main_other_tv.setOnClickListener {
            main_other_tv.setBackgroundResource(R.drawable.timeline_text_background)
            main_mine_tv.setBackgroundResource(R.drawable.timeline_tv_unselect_bg)
        }


    }


    private fun showCategoryInTab(category: List<String>) {
        category.forEach { cat ->
            var tab = tabbar.newTab()
            tab.text = cat
            tabbar.addTab(tab)
        }
    }
}