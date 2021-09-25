package com.aybarsacar.navdemoapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class VerifyDetailsFragment : Fragment() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {

    val root = inflater.inflate(R.layout.fragment_verify_details, container, false)

    val nameField = root.findViewById<TextView>(R.id.tv_name)
    val numberField = root.findViewById<TextView>(R.id.tv_number)

    val args: VerifyDetailsFragmentArgs by navArgs()

    nameField.text = args.name
    numberField.text = args.number.toString()

    // Inflate the layout for this fragment
    return root
  }
}

