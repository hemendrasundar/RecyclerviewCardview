package com.hemendra.recyclerviewcardview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hemendra.restapi.Posts
import com.hemendra.restapi.PostsItem
import org.w3c.dom.Text

class RvAdapter(var context:Context,var postarray:MutableList<PostsItem>): RecyclerView.Adapter<RvAdapter.MyViewHolder>()
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var layoutinflater = LayoutInflater.from(context)
        var view = layoutinflater.inflate(R.layout.rv_item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.tv_id.text = postarray[position].id.toString()
        holder.tv_title.text = postarray[position].title.toString()
        holder.tv_body.text = postarray[position].body.toString()


    }

    override fun getItemCount(): Int {
       return postarray.size
    }







    class MyViewHolder(view: View):RecyclerView.ViewHolder(view)
    {
        var tv_title = view.findViewById<TextView>(R.id.tv_title)
        var tv_id = view.findViewById<TextView>(R.id.tv_id)
        var tv_body = view.findViewById<TextView>(R.id.tv_body)

    }

}
