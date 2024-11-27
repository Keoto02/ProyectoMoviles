package com.example.gesturelab.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gesturelab.R
import com.example.gesturelab.SaladMenu

class SaladMenuViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val saladImage = view.findViewById<ImageView>(R.id.salad_image)
    val saladName = view.findViewById<TextView>(R.id.salad_name)
    val saladPrice = view.findViewById<TextView>(R.id.salad_price)

    fun bind(saladMenu: SaladMenu) {
        saladImage.setImageResource(saladMenu.saladImage)
        saladName.text = saladMenu.saladName
        saladPrice.text = "Desde: $${saladMenu.saladPrice}"
    }
}