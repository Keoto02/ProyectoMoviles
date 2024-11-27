package com.example.gesturelab.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gesturelab.FavoriteMenu
import com.example.gesturelab.R

class FavoriteMenuAdapter(private val favoriteMenuList: List<FavoriteMenu>): RecyclerView.Adapter<FavoriteMenuViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteMenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_favorite_menu,parent,false)
        return FavoriteMenuViewHolder(view)
    }

    override fun getItemCount(): Int {
        return favoriteMenuList.size
    }

    override fun onBindViewHolder(holder: FavoriteMenuViewHolder, position: Int) {
        holder.bind(favoriteMenuList[position])
    }
}