package com.example.gesturelab.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gesturelab.PizzaMenu
import com.example.gesturelab.R

class PizzaMenuViewHolder(view: View, private val onClickListener: (PizzaMenu)->Unit): RecyclerView.ViewHolder(view) {
    val pizzaImage = view.findViewById<ImageView>(R.id.pizza_image)
    val pizzaName = view.findViewById<TextView>(R.id.pizza_name)
    val pizzaPrice = view.findViewById<TextView>(R.id.pizza_price)

    fun bind(pizzaMenu: PizzaMenu) {
        pizzaImage.setImageResource(pizzaMenu.pizzaImage)
        pizzaName.text = pizzaMenu.pizzaName
        pizzaPrice.text = "Desde: $${pizzaMenu.pizzaPrice}"


        itemView.setOnClickListener {
            onClickListener(pizzaMenu)
        }
    }
}