package com.supersolid.honestfoo

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.supersolid.honestfoo.databinding.FragmentLoadBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope



class LoadFragment : Fragment() {

    private fun initProgBar() {
        lifecycleScope.launch {
            for (progress in 1..100) {
                withContext(Dispatchers.Main) {
                    yyyyy.progBarSplashScrn.progress = progress
                }
                delay(SPLASH_SCREEN_TIME / 125)
            }
        }
    }

    companion object {
        private const val SPLASH_SCREEN_TIME: Long = 1500
    }

    private var dddd: FragmentLoadBinding? = null
    private val yyyyy
        get() = dddd ?: throw RuntimeException("FragmentLoadBinding = null")


    private fun eeeeeeee() {
        Snackbar.make(
            yyyyy.root,
            "Error, error, error",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dddd = FragmentLoadBinding.inflate(inflater, container, false)
        return yyyyy.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            initProgBar()
            Handler(Looper.myLooper()!!).postDelayed({
                findNavController().navigate(R.id.action_loadFragment_to_takeGameFragment)
            }, SPLASH_SCREEN_TIME)


        } catch (e: Exception) {
            eeeeeeee()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        dddd = null
        super.onDestroy()
    }
}