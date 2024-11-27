package com.example.gesturelab.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gesturelab.R
import com.example.gesturelab.SaladMenu

class SaladMenuAdapter(private val saladMenuList: List<SaladMenu>): RecyclerView.Adapter<SaladMenuViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SaladMenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_game_menu,parent,false)
        return SaladMenuViewHolder(view)
    }

    override fun getItemCount(): Int {
        return saladMenuList.size
    }

    override fun onBindViewHolder(holder: SaladMenuViewHolder, position: Int) {
        holder.bind(saladMenuList[position])
    }
}