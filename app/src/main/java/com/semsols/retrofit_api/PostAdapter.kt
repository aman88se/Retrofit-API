package com.semsols.retrofit_api

import android.icu.text.CaseMap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter (val postModel: MutableList<PostModel>): RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_recyclerview,parent,false)

        return PostViewHolder(view)

    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {

        return holder.bindView(postModel[position])

    }

    override fun getItemCount(): Int {

        return postModel.size

    }
}

class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    private val Title: TextView = itemView.findViewById(R.id.Title)
    private val Body: TextView = itemView.findViewById(R.id.Body)

    fun bindView(postModel: PostModel){

        Title.text = postModel.title
        Body.text = postModel.body

    }
}