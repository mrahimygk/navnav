package com.example.navdrawer.ui.more

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.navdrawer.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.findNavController

class ShowMoreFragment : Fragment() {

    private lateinit var viewModel: ShowMoreViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewModel =
                ViewModelProviders.of(this).get(ShowMoreViewModel::class.java)
        return inflater.inflate(R.layout.fragment_show_more, container, false)
    }
}