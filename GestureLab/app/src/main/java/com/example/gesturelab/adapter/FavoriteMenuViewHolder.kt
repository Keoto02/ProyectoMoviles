package com.example.gesturelab.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gesturelab.FavoriteMenu
import com.example.gesturelab.R

class FavoriteMenuViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val favoriteImage = view.findViewById<ImageView>(R.id.favorite_image)
    val favoriteName = view.findViewById<TextView>(R.id.favorite_name)
    val favoritePrice = view.findViewById<TextView>(R.id.favorite_price)

    fun bind(favoriteMenu: FavoriteMenu) {
        favoriteImage.setImageResource(favoriteMenu.favoriteImage)
        favoriteName.text = favoriteMenu.favoriteName
        favoritePrice.text = "Desde: $${favoriteMenu.favoritePrice}"
    }
}