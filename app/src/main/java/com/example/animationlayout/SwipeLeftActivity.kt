package com.example.animationlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.animationlayout.ProjetoKotlin.AnimationLayout

class SwipeLeftActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipe_left)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setHomeButtonEnabled(true)
        toolbar.setNavigationOnClickListener { onBackPressed() }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        AnimationLayout.animateSwipeLeft(this)
        finish()
    }
}
