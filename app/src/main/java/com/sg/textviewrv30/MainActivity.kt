package com.sg.textviewrv30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        supportActionBar?.hide()

        val posts = Post4Lines().createPosts()
        logi("   size = ${posts.size} ")
        posts.forEach { logi("${it.postText.toString()}") }




/*
        val currentPost = CreatePosts().createPost4999071()
        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraint_layout)
        val drawPostHelper = DrawPostHelper()
        drawPostHelper.drawPost( constraintLayout, currentPost)*/
    }
    fun logi(message: String) {
        Log.i("gg", message)
    }
}
