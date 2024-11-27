package com.example.gesturelab.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gesturelab.PizzaMenu
import com.example.gesturelab.R

class PizzaMenuAdapter(private val pizzaMenuList: List<PizzaMenu>, private val onClickListener: (PizzaMenu)->Unit): RecyclerView.Adapter<PizzaMenuViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaMenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pizza_menu,parent,false)
        return PizzaMenuViewHolder(view, onClickListener)
    }

    override fun getItemCount(): Int {
        return pizzaMenuList.size
    }

    override fun onBindViewHolder(holder: PizzaMenuViewHolder, position: Int) {
        holder.bind(pizzaMenuList[position])
    }
}