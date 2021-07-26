package com.dicoding.obsidian

import android.content.ComponentCallbacks
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewRockAdapter(private val listRock: ArrayList<Rock>) : RecyclerView.Adapter<CardViewRockAdapter.CardViewViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Rock)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewRockAdapter.CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewRockAdapter.CardViewViewHolder, position: Int) {
        val rock = listRock[position]
        Glide.with(holder.itemView.context)
            .load(rock.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = rock.name
        holder.tvDetail.text = rock.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listRock[holder.adapterPosition])
        }

    }

    override fun getItemCount(): Int {
        return listRock.size
    }
}