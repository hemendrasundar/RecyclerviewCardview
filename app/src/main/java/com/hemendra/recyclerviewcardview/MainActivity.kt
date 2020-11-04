package com.hemendra.recyclerviewcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hemendra.restapi.Posts
import com.hemendra.restapi.PostsItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arralist = mutableListOf<PostsItem>()
        arralist.add(PostsItem("test body",1,"test title",123))
        arralist.add(PostsItem("test body1",1,"test title",123))
        arralist.add(PostsItem("test body2",1,"test title",123))
        arralist.add(PostsItem("test body3",1,"test title",123))
        arralist.add(PostsItem("test body4",1,"test title",123))
        arralist.add(PostsItem("test body5",1,"test title",123))
        arralist.add(PostsItem("test body6",1,"test title",123))
        arralist.add(PostsItem("test body7",1,"test title",123))
        arralist.add(PostsItem("test body8",1,"test title",123))
        arralist.add(PostsItem("test body9",1,"test title",123))
        var rv=findViewById<RecyclerView>(R.id.rv)
        var adapter = RvAdapter(this@MainActivity, arralist)
        //rv.layoutManager =  LinearLayoutManager(applicationContext,LinearLayoutManager.VERTICAL,false)
     //   rv.layoutManager =  LinearLayoutManager(applicationContext,LinearLayoutManager.HORIZONTAL,false)
        rv.layoutManager =  GridLayoutManager(applicationContext,2)
        rv.adapter = adapter
    }
}