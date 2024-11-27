package com.example.gesturelab

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gesturelab.adapter.PizzaMenuAdapter

class fragment_menu : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        recyclerView = view.findViewById(R.id.rv_pizza_menu)
        recyclerView.layoutManager = GridLayoutManager(context, 2)

        // Pasar listener del adaptador
        recyclerView.adapter = PizzaMenuAdapter(PizzaMenuProvider.pizzaMenuList) { pizzaMenu ->
            val fragment = fragment_pizza_menu_result().apply {
                arguments = Bundle().apply {
                    putInt("pizzaImage", pizzaMenu.pizzaImage)
                    putString("pizzaName", pizzaMenu.pizzaName)
                    putString("pizzaPrice", pizzaMenu.pizzaPrice.toString())
                    putString("pizzaDescription", pizzaMenu.pizzaDescription)
                }
            }

            parentFragmentManager.beginTransaction()
                .replace(R.id.frame_container, fragment)
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}