package com.supersolid.honestfoo

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.supersolid.honestfoo.databinding.ActivityLoadUrlBinding
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class LoadUrlActivity : AppCompatActivity() {
    val gtgttg by lazy {
        intent.getParcelableExtra(Constantine.KEY_DATA_FOR_VEB_VIEVgtgt) as DataForVebVievgtttgt?
    }


    private val bgbgbggb = 1

    private fun jujikiki() {
        val frfrgttg = jgidhgjdk.settings
        frfrgttg.javaScriptEnabled = true

        frfrgttg.useWideViewPort = true

        frfrgttg.loadWithOverviewMode = true
        frfrgttg.allowFileAccess = true
        frfrgttg.domStorageEnabled = true
        frfrgttg.userAgentString = frfrgttg.userAgentString.replace("; wv", "")

        frfrgttg.javaScriptCanOpenWindowsAutomatically = true
        frfrgttg.setSupportMultipleWindows(false)

        frfrgttg.displayZoomControls = false
        frfrgttg.builtInZoomControls = true
        frfrgttg.setSupportZoom(true)

        frfrgttg.pluginState = WebSettings.PluginState.ON
        frfrgttg.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        frfrgttg.setAppCacheEnabled(true)

        frfrgttg.allowContentAccess = true
    }

    var bggbggb: ValueCallback<Array<Uri>>? = null
    lateinit var jgidhgjdk: WebView

    var urlfififif = ""


    lateinit var dededef: ActivityLoadUrlBinding
    var kgjfhdkxf: String? = null


    private fun bbnbnko(): String {
        val ftgttg = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
        val packfrfrrfr = Constantine.packgtgtgtg

        val appsFlyDatagtgtgt = gtgttg?.vbggbbgbg ?: "null"

        val advIdgttgtg = gtgttg?.bgggbg ?: "null"

        val appLinkDatagtgttg = gtgttg?.bgbbgbg ?: "null"

        val linkkkhhyyh = gtgttg?.jujjuuj ?: "null"

//        lifecycleScope.launch {
//            delay(1500)
//            Snackbar.make(
//                dededef.root, "appLinkData in VEBVIEV is ${appLinkDatagtgttg}",
//                Snackbar.LENGTH_SHORT
//            ).show()
//            delay(1500)
//            Snackbar.make(
//                dededef.root, "appsFlyer in VEBVIEV ${appsFlyDatagtgtgt}",
//                Snackbar.LENGTH_SHORT
//            ).show()
//
//            delay(1500)
//            Snackbar.make(
//                dededef.root, "link is ${linkkkhhyyh}",
//                Snackbar.LENGTH_SHORT
//            ).show()
//
//            delay(1500)
//            Snackbar.make(
//                dededef.root, "adverId is ${advIdgttgtg}",
//                Snackbar.LENGTH_SHORT
//            ).show()
//        }


        val hyyhhyhy = AppsFlyerLib.getInstance().getAppsFlyerUID(this)

        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        val bbgbg = "deviceID="
        val frfrfrfr = "sub_id_1="
        val bgbggbbg = "sub_id_5="
        val sub6frfr = "sub_id_6="
        val adidddddd = "ad_id="
        val sub4frfrr = "sub_id_4="


        val nononok = "naming"
        val bnbnbn = "deeporg"

        val eerret = Build.VERSION.RELEASE


        var hylphlyplhly = ""
        if (appsFlyDatagtgtgt != "null") {
            hylphlyplhly =
                "$linkkkhhyyh$frfrfrfr$appsFlyDatagtgtgt&$bbgbg$hyyhhyhy&$adidddddd$advIdgttgtg&$sub4frfrr$packfrfrrfr&$bgbggbbg$eerret&$sub6frfr$nononok"
            gtgtgtgtgt(hyyhhyhy.toString())
        } else {
            hylphlyplhly =
                "$linkkkhhyyh$frfrfrfr$appLinkDatagtgttg&$bbgbg$hyyhhyhy&$adidddddd$advIdgttgtg&$sub4frfrr$packfrfrrfr&$bgbggbbg$eerret&$sub6frfr$bnbnbn"
            gtgtgtgtgt(hyyhhyhy.toString())
        }

        Log.d("lolo", "link from vebViev is $hylphlyplhly")
        return ftgttg.getString("SAVED_URL", hylphlyplhly).toString()
    }

    fun hnnhhnnh(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (urlfififif == "") {
                urlfififif = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val cccvfc =
                    getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val ededededededed = cccvfc.edit()
                ededededededed.putString("SAVED_URL", lurlurlurlurlur)
                ededededededed.apply()
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dededef = ActivityLoadUrlBinding.inflate(layoutInflater)
        setContentView(dededef.root)

        jgidhgjdk = dededef.vovovo

        Snackbar.make(
            dededef.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val gttgththy = CookieManager.getInstance()
        gttgththy.setAcceptCookie(true)
        gttgththy.setAcceptThirdPartyCookies(jgidhgjdk, true)
        jujikiki()
        val ghghgh: Activity = this
        jgidhgjdk.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (bgbggbffff(url)) {

                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        startActivity(intent)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                hnnhhnnh(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(ghghgh, description, Toast.LENGTH_SHORT).show()
            }


        }
        jgidhgjdk.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                bggbggb?.onReceiveValue(null)
                bggbggb = filePathCallback
                var totya: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (totya!!.resolveActivity(packageManager) != null) {

                    var bhnhnhnhhn: File? = null
                    try {
                        bhnhnhnhhn = noka()
                        totya.putExtra("PhotoPath", kgjfhdkxf)
                    } catch (ex: IOException) {
                    }

                    if (bhnhnhnhhn != null) {
                        kgjfhdkxf = "file:" + bhnhnhnhhn.absolutePath
                        totya.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(bhnhnhnhhn)
                        )
                    } else {
                        totya = null
                    }
                }
                val boka = Intent(Intent.ACTION_GET_CONTENT)
                boka.addCategory(Intent.CATEGORY_OPENABLE)
                boka.type = "image/*"
                val gtgtgtt: Array<Intent?> =
                    totya?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val opopopop = Intent(Intent.ACTION_CHOOSER)
                opopopop.putExtra(Intent.EXTRA_INTENT, boka)
                opopopop.putExtra(Intent.EXTRA_TITLE, getString(R.string.take_imfrfrrrffr))
                opopopop.putExtra(Intent.EXTRA_INITIAL_INTENTS, gtgtgtt)
                startActivityForResult(
                    opopopop, bgbgbggb
                )
                return true
            }

            @Throws(IOException::class)
            private fun noka(): File {
                var frfrrfr = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!frfrrfr.exists()) {
                    frfrrfr.mkdirs()
                }

                frfrrfr =
                    File(frfrrfr.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return frfrrfr
            }

        }

        jgidhgjdk.loadUrl(bbnbnko())
    }


    private fun gtgtgtgtgt(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val jujuuj = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $jujuuj"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val vccxddddddddd =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $vccxddddddddd"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val frfrfr = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $frfrfr"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }


    private fun bgbggbffff(uri: String): Boolean {

        val gttggt = packageManager
        try {

            gttggt.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != bgbgbggb || bggbggb == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var fnrnfnrf: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                fnrnfnrf = arrayOf(Uri.parse(kgjfhdkxf))
            } else {
                val vfvddsser = data.dataString
                if (vfvddsser != null) {
                    fnrnfnrf = arrayOf(Uri.parse(vfvddsser))
                }
            }
        }
        bggbggb?.onReceiveValue(fnrnfnrf)
        bggbggb = null
    }


    private var hyhjuuj = false
    override fun onBackPressed() {


        if (jgidhgjdk.canGoBack()) {
            if (hyhjuuj) {
                jgidhgjdk.stopLoading()
                jgidhgjdk.loadUrl(urlfififif)
            }
            this.hyhjuuj = true
            jgidhgjdk.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                hyhjuuj = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }


}