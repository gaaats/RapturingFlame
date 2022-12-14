package com.supersolid.honestfoo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.supersolid.honestfoo.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import kotlinx.coroutines.launch
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope



@AndroidEntryPoint
@ActivityScoped

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        _bindinggttg = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingggt.root)


        lifecycleScope.launch {
            mainViewModelgtgttgt.vbhjjujuj()

            mainViewModelgtgttgt.jukoloplpl(this@MainActivity)

            mainViewModelgtgttgt.bbgbgbgbg(this@MainActivity)

            mainViewModelgtgttgt.uuuuuuioo()
        }

        mainViewModelgtgttgt.hhhhh.observe(this) {
            when (it) {
                SortClassssss.LOADINGGG -> {
                    Log.d("lolo", "do nothing")
                }
                SortClassssss.MODERATIONN -> {
                    startGaaame()
                }
                SortClassssss.TEST_VEBVBB -> {
                    val dataForSend = mainViewModelgtgttgt.gtgttgt()
                    goToVebVievActivity(dataForSend)
                }
                SortClassssss.REAL_START_NO_APPSSS -> {
                    mainViewModelgtgttgt.gtgttgt().also {
                        goToVebVievActivity(it)
                    }
                }
                SortClassssss.REAL_STARTTT -> {
                    mainViewModelgtgttgt.gtgttgt().also {
                        goToVebVievActivity(it)
                    }
                }

            }
        }
    }

    private fun startGaaame() {
        val intent = Intent(this, PlySomeGameActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun goToVebVievActivity(dataForSend: DataForVebVievgtttgt) {
        val intent = Intent(this@MainActivity, LoadUrlActivity::class.java).also {
            it.putExtra(Constantine.KEY_DATA_FOR_VEB_VIEVgtgt, dataForSend)
        }
        startActivity(intent)
        finish()
    }

    private val mainViewModelgtgttgt by viewModels<FilltteerVieevModela>()

    private var _bindinggttg: ActivityMainBinding? = null
    private val bindingggt
        get() = _bindinggttg ?: throw RuntimeException("ActivityMainBinding = null")
}