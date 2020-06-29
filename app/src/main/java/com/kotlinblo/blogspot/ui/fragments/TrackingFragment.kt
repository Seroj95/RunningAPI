package com.kotlinblo.blogspot.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.gms.maps.GoogleMap
import com.kotlinblo.blogspot.R
import com.kotlinblo.blogspot.servicies.TrackingService
import com.kotlinblo.blogspot.ui.viewmodels.MainViewModel
import com.kotlinblo.blogspot.util.ACTION_START_OR_RESUME_SERVICE
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_tracking.*

@AndroidEntryPoint
class TrackingFragment :Fragment(R.layout.fragment_tracking){
private val viewModel:MainViewModel by viewModels()
    private var map:GoogleMap? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnToggleRun.setOnClickListener {
            sendComandToService(ACTION_START_OR_RESUME_SERVICE)
        }
        mapView.getMapAsync {
            mapView.onCreate(savedInstanceState)
            mapView.getMapAsync{
                map=it
            }
        }

    }
private fun sendComandToService(action:String)=
    Intent(requireContext(),TrackingService::class.java).also {
        it.action=action
        requireContext().startService(it)
    }
    override fun onResume() {
        super.onResume()
        mapView?.onResume()
    }

    override fun onStart() {
        super.onStart()
        mapView?.onStart()
    }

    override fun onStop() {
        super.onStop()
        mapView?.onStop()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView?.onLowMemory()

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        mapView.onSaveInstanceState(outState)
    }
}