package com.example.overflowmenutest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import com.example.overflowmenutest.databinding.Screen1Binding
import com.example.overflowmenutest.databinding.Screen2Binding

class screen2Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: Screen2Binding = DataBindingUtil.inflate(inflater, R.layout.screen2, container, false)
        return binding.root
    }
}