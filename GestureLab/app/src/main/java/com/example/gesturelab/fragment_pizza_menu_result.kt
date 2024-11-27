package com.example.gesturelab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class fragment_pizza_menu_result : Fragment() {

    private lateinit var pizzaImage: ImageView
    private lateinit var pizzaName: TextView
    private lateinit var pizzaPrice: TextView
    private lateinit var pizzaDescription: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_pizza_menu_result, container, false)

        pizzaImage = view.findViewById(R.id.pizza_image)
        pizzaName = view.findViewById(R.id.pizza_name)
        pizzaPrice = view.findViewById(R.id.pizza_price)
        pizzaDescription = view.findViewById(R.id.pizza_details)

        val pizzaImageResId = arguments?.getInt("pizzaImage") ?: 0
        pizzaName.text = arguments?.getString("pizzaName") ?: ""
        val pizzaPriceValue = arguments?.getString("pizzaPrice")?.toDoubleOrNull() ?: 0.0
        pizzaDescription.text = arguments?.getString("pizzaDescription") ?: ""

        pizzaImage.setImageResource(pizzaImageResId)
        pizzaPrice.text = "Desde: $${pizzaPriceValue}"

        return view
    }

    companion object {
        fun newInstance(pizzaImage: Int, pizzaName: String, pizzaPrice: Double, pizzaDescription: String): fragment_pizza_menu_result {
            val fragment = fragment_pizza_menu_result()
            val args = Bundle()
            args.putInt("pizzaImage", pizzaImage)
            args.putString("pizzaName", pizzaName)
            args.putString("pizzaPrice", pizzaPrice.toString())
            args.putString("pizzaDescription", pizzaDescription)
            fragment.arguments = args
            return fragment
        }
    }
}