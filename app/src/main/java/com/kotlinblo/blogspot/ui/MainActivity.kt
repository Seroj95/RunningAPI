package com.kotlinblo.blogspot.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.kotlinblo.blogspot.R
import com.kotlinblo.blogspot.db.RunDAO
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     setSupportActionBar(toolbar)
        bottomNavigationView.setupWithNavController(navHostFragment.findNavController())
        navHostFragment.findNavController().addOnDestinationChangedListener {
                _, destination,_ ->

            when(destination.id){
                R.id.settingsFragment,R.id.runFragment,R.id.statisticFragment ->
                    bottomNavigationView.visibility= View.VISIBLE
                else->bottomNavigationView.visibility=View.GONE

            }
        }
    }
}