package com.example.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.twitter.Adapter.FeedAdapter
import com.example.twitter.Adapter.StoryAdapter
import com.example.twitter.Model.Post
import com.example.twitter.Model.Story

class MainActivity : AppCompatActivity() {

    lateinit var recyclerStory: RecyclerView
    lateinit var recyclerFeed : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews(){
        recyclerStory = findViewById(R.id.recyclerStory)
        recyclerStory.setLayoutManager(LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false))
        recyclerFeed = findViewById(R.id.recyclerFeed)
        recyclerFeed.setLayoutManager(GridLayoutManager(this,1))

        refreshStoryAdapter(getAllStories())
        refreshFeedAdapter(getAllFeeds())
    }
    fun refreshStoryAdapter(chats: ArrayList<Story>){
        val adapter = StoryAdapter(this,chats)
        recyclerStory.adapter = adapter
    }
    fun refreshFeedAdapter(posts: ArrayList<Post>){
        val adapter = FeedAdapter(this,posts)
        recyclerFeed.adapter = adapter
    }
    fun getAllStories(): ArrayList<Story>{
        val stories: ArrayList<Story> = ArrayList()

        stories.add(Story(R.drawable.im_shohboz,"Shahboz"))
        stories.add(Story(R.drawable.im_bektosh,"Bektosh"))
        stories.add(Story(R.drawable.dilmurodaka,"Dilmurod "))
        stories.add(Story(R.drawable.dilmurod,"Dilmurod"))
        stories.add(Story(R.drawable.rustam,"Rustam"))
        stories.add(Story(R.drawable.islom,"Islom"))
        stories.add(Story(R.drawable.im_shohboz,"Shahboz"))
        stories.add(Story(R.drawable.im_bektosh,"Bektosh"))
        stories.add(Story(R.drawable.dilmurodaka,"Dilmurod"))
        stories.add(Story(R.drawable.dilmurod,"Dilmurod"))
        stories.add(Story(R.drawable.rustam,"Rustam"))
        stories.add(Story(R.drawable.islom,"Islom"))

        return stories
    }
    fun getAllFeeds(): ArrayList<Post>{
        val posts: ArrayList<Post> = ArrayList()

        posts.add(Post(R.drawable.background_5,"Azizbek Khushvaktov",R.drawable.banner2))
        posts.add(Post(R.drawable.background_1,"Azizbek Khushvaktov",R.drawable.background_3))
        posts.add(Post(R.drawable.banner2,"Azizbek Khushvaktov",R.drawable.im_10))
        posts.add(Post(R.drawable.im_10,"Azizbek Khushvaktov",R.drawable.im_7))
        posts.add(Post(R.drawable.im_7,"Azizbek Khushvaktov",R.drawable.img))
        posts.add(Post(R.drawable.background_1,"Azizbek Khushvaktov",R.drawable.background_1))
        posts.add(Post(R.drawable.banner2,"Azizbek Khushvaktov",R.drawable.banner2))
        posts.add(Post(R.drawable.background_5,"Azizbek Khushvaktov",R.drawable.im_7))
        posts.add(Post(R.drawable.img,"Azizbek Khushvaktov",R.drawable.im_10))
        posts.add(Post(R.drawable.background_5,"Azizbek Khushvaktov",R.drawable.background_3))

        return posts
    }
}