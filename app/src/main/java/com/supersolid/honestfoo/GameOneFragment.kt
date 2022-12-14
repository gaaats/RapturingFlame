package com.supersolid.honestfoo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.supersolid.honestfoo.databinding.FragmentGameOneBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class GameOneFragment : Fragment() {
    var sumgtgtt = 0

    private var vfvfvfgttg: FragmentGameOneBinding? = null
    private val juujju
        get() = vfvfvfgttg ?: throw RuntimeException("FragmentGameOneBinding = null")

    val totto =
        "Supplemental materials released by the company on Tuesday (Feb. 8) in tandem with earnings show that within the Merchant Acceptance segment, revenues were up 18%, to \$1.7 billion, and global merchant volumes and transaction growth were up a respective 22% and 18% in the quarter. The segment logged 19% eCommerce growth in the quarter, according to the company."

    val liiist by lazy {
        listOf(
            ContextCompat.getDrawable(requireActivity(), R.drawable.hhhh1),
            ContextCompat.getDrawable(requireActivity(), R.drawable.coiin),
            ContextCompat.getDrawable(requireActivity(), R.drawable.hhhh4),
            ContextCompat.getDrawable(requireActivity(), R.drawable.hhhh3),
        ).shuffled()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        vfvfvfgttg = FragmentGameOneBinding.inflate(inflater, container, false)
        return juujju.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            amkfkrfrf()
            cliiickckck2()
            gtgtkgt()
            gtgtgtgtttt()
            cliiiick()

        } catch (e: Exception) {
            afrhgthUygt()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun cliiickckck2() {
        juujju.btnElem8.setOnClickListener {
            it.visibility = View.GONE
            bgbgbg()
        }
        juujju.btnElem9.setOnClickListener {
            it.visibility = View.GONE
            bgbgbg()
        }
        juujju.btnElem10.setOnClickListener {
            it.visibility = View.GONE
            bgbgbg()
        }
        juujju.btnElem13.setOnClickListener {
            it.visibility = View.GONE
            bgbgbg()
        }
        juujju.btnElem12.setOnClickListener {
            it.visibility = View.GONE
            bgbgbg()
        }
    }

    private fun cliiiick() {
        juujju.btnElem1.setOnClickListener {
            it.visibility = View.GONE
            bgbgbg()
        }
        juujju.btnElem2.setOnClickListener {
            it.visibility = View.GONE
            bgbgbg()
        }
        juujju.btnElem3.setOnClickListener {
            it.visibility = View.GONE
            bgbgbg()
        }
        juujju.btnElem4.setOnClickListener {
            it.visibility = View.GONE
            bgbgbg()
        }
        juujju.btnElem5.setOnClickListener {
            it.visibility = View.GONE
            bgbgbg()
        }
        juujju.btnElem6.setOnClickListener {
            it.visibility = View.GONE
            bgbgbg()
        }
        juujju.btnElem7.setOnClickListener {
            it.visibility = View.GONE
            bgbgbg()
        }
    }

    private fun gtgtgtgtttt() {
        juujju.root.background.alpha = 230
    }

    private fun gtgtkgt() {
        if (totto == "555") {
            Snackbar.make(
                juujju.root,
                totto,
                Snackbar.LENGTH_LONG
            ).show()
        }
    }

    private fun amkfkrfrf() {
        juujju.btnElem1.setImageDrawable(liiist.random())
        juujju.btnElem2.setImageDrawable(liiist.random())
        juujju.btnElem3.setImageDrawable(liiist.random())
        juujju.btnElem4.setImageDrawable(liiist.random())
        juujju.btnElem5.setImageDrawable(liiist.random())
        juujju.btnElem6.setImageDrawable(liiist.random())
        juujju.btnElem7.setImageDrawable(liiist.random())
        juujju.btnElem8.setImageDrawable(liiist.random())
        juujju.btnElem9.setImageDrawable(liiist.random())
        juujju.btnElem10.setImageDrawable(liiist.random())
        juujju.btnElem12.setImageDrawable(liiist.random())
        juujju.btnElem13.setImageDrawable(liiist.random())
    }


    override fun onDestroy() {
        vfvfvfgttg = null
        super.onDestroy()
    }

    private fun afrhgthUygt() {
        Snackbar.make(
            juujju.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }


    private fun slonny(imageView: ImageView) {
        lifecycleScope.launch {
            while (true) {
                var ismsms = bgbgbbg
                var gtjitji = plfr
                imageView.alpha = ismsms
                if (ismsms >= 1f) {
                    gtjitji = -0.05f
                }
                if (ismsms <= 0.1f) {
                    gtjitji = 0.05f
                }
                delay(30)
                ismsms += gtjitji
            }
        }
    }

    private fun gtgtgt(imageView: ImageView): Boolean {
        if (imageView.visibility == View.GONE) {
            return true
        }
        return false
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    private fun bgbgbg() {
        sumgtgtt += 1
        val frfrr = "COLLECTED: $sumgtgtt"
        juujju.tvSum.text = frfrr

        if (gtgtgt(juujju.btnElem1) && gtgtgt(juujju.btnElem2) && gtgtgt(
                juujju.btnElem3
            ) && gtgtgt(juujju.btnElem4) && gtgtgt(juujju.btnElem5) && gtgtgt(
                juujju.btnElem6
            ) && gtgtgt(juujju.btnElem7) && gtgtgt(juujju.btnElem8) && gtgtgt(
                juujju.btnElem9
            ) && gtgtgt(juujju.btnElem10) && gtgtgt(juujju.btnElem13) && gtgtgt(
                juujju.btnElem12
            )
        ) {
            findNavController().navigate(R.id.action_gameOneFragment_to_rellooadFragment)
        }
    }

    private fun kikiloo() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Exit, realy?")
            .setPositiveButton("Yes, Exit") { _, _ ->
                requireActivity().finish()
            }
            .setNegativeButton("Deny") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }

    var bgbgbbg = 0.8f
    var plfr = 0.05f

}