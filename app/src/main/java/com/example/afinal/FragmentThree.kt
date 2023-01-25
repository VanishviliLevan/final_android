package com.example.afinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class FragmentThree : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val text:TextView = view.findViewById(R.id.fragment_one_text)

        text.text = "Fragment Three"

    }


}