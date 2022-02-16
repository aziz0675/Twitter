package com.example.twitter.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.twitter.Model.Story
import com.example.twitter.R

import com.google.android.material.imageview.ShapeableImageView

class StoryAdapter(var context: Context, var items: ArrayList<Story>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun getItemCount(): Int {
        return  items.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_story_layout,parent,false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var story = items[position]

        if (holder is StoryViewHolder) {
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname

            iv_profile.setImageResource(story.profile)
            tv_fullname.text = story.fullname
        }
    }

    class StoryViewHolder(view: View):RecyclerView.ViewHolder(view) {
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView

        init {
            iv_profile = view.findViewById(R.id.iv_profile)
            tv_fullname = view.findViewById(R.id.tv_fullname)
        }
    }
}