package com.supersolid.honestfoo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.supersolid.honestfoo.databinding.FragmentGameTvoBinding
import com.supersolid.honestfoo.databinding.FragmentTakeGameBinding
import com.supersolid.honestfoo.gaaame.GameInterface
import com.supersolid.honestfoo.gaaame.GameerVieva


class GameTvoFragment : Fragment(), GameInterface {
    private var gggg: FragmentGameTvoBinding? = null
    private val btbuuuu get() = gggg ?: throw RuntimeException("FragmentGameTvoBinding = null")

    val lllll = listOf(
        R.drawable.hhhh1,
        R.drawable.hhhh3,
        R.drawable.hhhh4,
    )

    private var rfrgttt55freeeeer: GameerVieva? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gggg = FragmentGameTvoBinding.inflate(inflater, container, false)
        return btbuuuu.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        try {

            btbuuuu.root.background.alpha = 230
            btbuuuu.btnStartGaaame.setOnClickListener {
                rfrgttt55freeeeer =
                    GameerVieva(requireContext(), this, R.drawable.logaaa, lllll)
                rfrgttt55freeeeer!!.setBackgroundResource(R.drawable.bbbbbffgt)
                rfrgttt55freeeeer!!.background.alpha = 160
                btbuuuu.root.addView(rfrgttt55freeeeer)
                btbuuuu.btnStartGaaame.visibility = View.GONE
                btbuuuu.tvScoreGame1.visibility = View.GONE
                btbuuuu.imgLogoGame1.visibility = View.GONE
            }
        } catch (e: Exception) {
            ffgttggtiiiiii()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun ffgttggtiiiiii() {
        Snackbar.make(
            btbuuuu.root,
            "Error, error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onDestroy() {
        gggg = null
        super.onDestroy()
    }

    override fun vvvvv(score: Int) {
        val scscscrhhhhhh = "Score : $score"
        btbuuuu.root.removeView(rfrgttt55freeeeer)
        btbuuuu.tvScoreGame1.text = scscscrhhhhhh
        btbuuuu.btnStartGaaame.visibility = View.VISIBLE
        btbuuuu.tvScoreGame1.visibility = View.VISIBLE
        btbuuuu.imgLogoGame1.visibility = View.VISIBLE
        rfrgttt55freeeeer = null

        findNavController().navigate(R.id.action_gameTvoFragment_to_rellooadFragment)
    }



}