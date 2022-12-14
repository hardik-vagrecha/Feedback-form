package com.example.simpleapp

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PeopleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PeopleFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var prevButton: Button
    private lateinit var createButton: Button
    private lateinit var updateButton: Button
    private lateinit var deleteButton: Button
    private lateinit var nextButton: Button

    private lateinit var personName: EditText
    private lateinit var personAge: EditText
    private lateinit var personFavoriteColor: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        Log.v(TAG, msg:"People fragment: onCreateView()")
          Log.v(TAG, "People fragment: onCreateView()")
        val view = inflater.inflate(R.layout.fragment_people, container, false)

        this.personName = view.findViewById(R.id.input_person_name)
        this.personAge = view.findViewById(R.id.input_person_age)
        this.personFavoriteColor = view.findViewById(R.id.input_person_favorite_color)

        this.prevButton = view.findViewById(R.id.button_prev_person)
        this.createButton = view.findViewById(R.id.button_create_person)
        this.updateButton = view.findViewById(R.id.button_update_person)
        this.deleteButton = view.findViewById(R.id.button_delete_person)
        this.nextButton = view.findViewById(R.id.button_next_person)

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PeopleFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PeopleFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}