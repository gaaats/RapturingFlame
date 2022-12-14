package com.supersolid.honestfoo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.supersolid.honestfoo.databinding.FragmentRellooadBinding
import kotlinx.coroutines.delay
import kotlin.random.Random


class RellooadFragment : Fragment() {
    private var hyhhy: FragmentRellooadBinding? = null
    private val hyhyjiki get() = hyhhy ?: throw RuntimeException("FragmentRellooadBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        hyhhy = FragmentRellooadBinding.inflate(inflater, container, false)
        return hyhyjiki.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            val currentPoint = Random.nextInt(from = 1000, until = 50000)
            makeGooold(currentPoint)

            iniNavvvig()


        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun makeGooold(currentPoint: Int) {
        Snackbar.make(
            hyhyjiki.root,
            "You earned $currentPoint points",
            Snackbar.LENGTH_LONG
        ).show()
    }

    private fun iniNavvvig() {
        lifecycleScope.launchWhenCreated {
            delay(1900)
            findNavController().navigate(R.id.action_rellooadFragment_to_takeGameFragment)
        }
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        hyhhy = null
        super.onDestroy()
    }

    private fun vfvvf() {
        Snackbar.make(
            hyhyjiki.root,
            "Error 709...reloading",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

}