package com.supersolid.honestfoo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.supersolid.honestfoo.databinding.FragmentTakeGameBinding
import com.supersolid.honestfoo.gaaame.GameerVieva


class TakeGameFragment : Fragment() {


    private var _binding: FragmentTakeGameBinding? = null
    private val binding get() = _binding ?: throw RuntimeException("FragmentTakeGameBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTakeGameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.root.background.alpha = 230

            initSetonClickLissstener()

        } catch (e: Exception) {
            edfrgtysnackBarError()
        }
        super.onViewCreated(view, savedInstanceState)
    }

    private fun initSetonClickLissstener() {
        binding.imgTitpleGamefrrfr11.setOnClickListener {
            findNavController().navigate(R.id.action_takeGameFragment_to_gameOneFragment)
        }
        binding.imgTitpleGamefrrfr22.setOnClickListener {
            findNavController().navigate(R.id.action_takeGameFragment_to_gameTvoFragment)
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    private fun edfrgtysnackBarError() {
        Snackbar.make(
            binding.root,
            "Oops something went wrong, please try again...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }
}