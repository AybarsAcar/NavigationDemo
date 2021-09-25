package com.aybarsacar.navdemoapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController


class EnterDetailsFragment : Fragment() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    // Inflate the layout for this fragment
    val rootView = inflater.inflate(R.layout.fragment_enter_details, container, false)

    val buttonVerify = rootView.findViewById<Button>(R.id.btn_verify)
    val nameField = rootView.findViewById<EditText>(R.id.et_first_name)
    val numberField = rootView.findViewById<EditText>(R.id.et_mobile_number)


    buttonVerify.setOnClickListener {

      // get the name and the number
      val firstName = nameField.text.toString()
      val number = numberField.text.toString()

      when {
        firstName.isEmpty() -> Toast.makeText(activity, "Enter Name", Toast.LENGTH_SHORT).show()
        number.isEmpty() -> Toast.makeText(activity, "Enter Name", Toast.LENGTH_SHORT).show()

        else -> {
          // execute the navigation action with the bundle of arguments
          // created in the navigation xml
          findNavController().navigate(
            EnterDetailsFragmentDirections.actionEnterDetailsFragmentToVerifyDetailsFragment(
              name = firstName,
              number = number.toLong()
            )
          )
        }
      }

    }


    return rootView
  }
}