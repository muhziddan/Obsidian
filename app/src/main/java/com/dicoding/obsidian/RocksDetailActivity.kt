package com.dicoding.obsidian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class RocksDetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_age"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rocks_detail)

        val tvName: TextView = findViewById(R.id.tv_name_detail_activity)
        val tvDetail: TextView = findViewById(R.id.tv_detail_activity)
        val ivDetail: ImageView = findViewById(R.id.iv_detail_activity)



        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        tvName.text = name
        tvDetail.text = detail
        ivDetail.setImageResource(photo)

        supportActionBar?.title = "Rock type: $name"
    }
}