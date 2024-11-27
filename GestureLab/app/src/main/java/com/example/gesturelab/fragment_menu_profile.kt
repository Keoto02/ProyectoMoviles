package com.example.gesturelab

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gesturelab.adapter.SaladMenuAdapter

class fragment_menu_profile : Fragment(){

    private lateinit var recyclerView: RecyclerView
    private lateinit var etUsername: EditText
    private lateinit var etBirthday: EditText
    private lateinit var etGender: EditText
    private lateinit var etEmail: EditText
    private lateinit var btnEditSave: Button

    private var isEditing = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        // Inicializar vistas
        etUsername = view.findViewById(R.id.etUsername)
        etBirthday = view.findViewById(R.id.etBirthday)
        etGender = view.findViewById(R.id.etGender)
        etEmail = view.findViewById(R.id.etEmail)
        btnEditSave = view.findViewById(R.id.btnEdit)

        // Configurar campos como no editables inicialmente
        setFieldsEditable(false)

        // Configurar el botón
        btnEditSave.setOnClickListener {
            if (isEditing) {
                // Si estamos en modo edición, guardar datos y bloquear campos
                setFieldsEditable(false)
                btnEditSave.text = "Editar"
                isEditing = false
                // Aquí puedes agregar lógica para guardar los datos en la base de datos
            } else {
                // Si no estamos en modo edición, permitir edición
                setFieldsEditable(true)
                btnEditSave.text = "Guardar"
                isEditing = true
            }
        }

        return view
    }

    private fun setFieldsEditable(editable: Boolean) {

        etUsername.isFocusable = editable
        etUsername.isFocusableInTouchMode = editable
        etUsername.isClickable = editable

        etBirthday.isFocusable = editable
        etBirthday.isFocusableInTouchMode = editable
        etBirthday.isClickable = editable

        etGender.isFocusable = editable
        etGender.isFocusableInTouchMode = editable
        etGender.isClickable = editable

        etEmail.isFocusable = editable
        etEmail.isFocusableInTouchMode = editable
        etEmail.isClickable = editable

    }
}