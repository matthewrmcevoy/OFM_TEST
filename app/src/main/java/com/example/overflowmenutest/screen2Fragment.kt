package com.example.overflowmenutest

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.onNavDestinationSelected
import com.example.overflowmenutest.databinding.Screen2Binding

class screen2Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: Screen2Binding = DataBindingUtil.inflate(inflater, R.layout.screen2, container, false)
        setHasOptionsMenu(true)
        binding.loginButton.setOnClickListener {
            findNavController().navigate(screen2FragmentDirections.actionScreen2FragmentToInstructionFragment())
        }

        return binding.root
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.overflow_menu_test, menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val navController = findNavController()
        return item.onNavDestinationSelected(navController)
    }
}