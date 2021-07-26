package com.dicoding.obsidian

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class  MainActivity : AppCompatActivity() {
    private lateinit var rvRocks: RecyclerView
    private var list: ArrayList<Rock> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvRocks = findViewById(R.id.rv_rocks)
        rvRocks.setHasFixedSize(true)

        list.addAll(RocksData.listData)
        showRecyclerCardView()

        supportActionBar?.title = "Rock List"
    }

    private fun showRecyclerCardView() {
        rvRocks.layoutManager = LinearLayoutManager(this)
        val cardViewRockAdapter = CardViewRockAdapter(list)
        rvRocks.adapter = cardViewRockAdapter

        cardViewRockAdapter.setOnItemClickCallback(object : CardViewRockAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Rock) {
                val showDetail = Intent(this@MainActivity, RocksDetailActivity::class.java)
                showDetail.putExtra(RocksDetailActivity.EXTRA_NAME, data.name)
                showDetail.putExtra(RocksDetailActivity.EXTRA_DETAIL, data.detail)
                showDetail.putExtra(RocksDetailActivity.EXTRA_PHOTO, data.photo)
                startActivity(showDetail)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }




    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                //title = "About"
                val moveAbout = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveAbout)
            }
        }
    }
}