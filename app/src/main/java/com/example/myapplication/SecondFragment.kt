package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onStart() {

        super.onStart()
        //btn_2next.setOnclickListener
        (activity as MainActivity).navController.navigate(R.id.action_secondFragment_to_thirdFragment)
        //  btn_2back.setOnClickListener
        (activity as MainActivity).navController.navigate(R.id.action_secondFragment_to_firstFragment)

    }


}