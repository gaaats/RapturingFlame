package com.supersolid.honestfoo

import android.app.Application
import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import androidx.lifecycle.LiveData
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope




@HiltViewModel
class FilltteerVieevModela @Inject constructor(
    private val application: Application
) : ViewModel() {

    private val _advertisingIdClientgtgt = MutableLiveData<String>()
    val advertisingIdClientgttggt: LiveData<String>
        get() = _advertisingIdClientgtgt

    var tempApsData = "sad"

    private var gtgtttg = MutableLiveData<SortClassssss>()
    val hhhhh: LiveData<SortClassssss>
        get() = gtgtttg

    private val _linkgtgt = MutableLiveData<String>()
    val linkggg: LiveData<String>
        get() = _linkgtgt

    private val _appsFlyerDattaGottenfgt = MutableLiveData<String?>()
    val appsFlyerDattaGottengtt: LiveData<String?>
        get() = _appsFlyerDattaGottenfgt

    private val _appLinkDataaaagttg = MutableLiveData<String?>()
    val appLinkDataaaaaa: LiveData<String?>
        get() = _appLinkDataaaagttg

    private val _ansvFromGeoServicehyhy = MutableLiveData<DataFromApiResourcegtgtt<CountryCodeJS?>>()
    val ansvFromGeoServicejuujuj: LiveData<DataFromApiResourcegtgtt<CountryCodeJS?>>
        get() = _ansvFromGeoServicehyhy

    private val _ansvFromDevilgtgt = MutableLiveData<DataFromApiResourcegtgtt<GeoDev>>()
    val ansvFromDevilgtgt: LiveData<DataFromApiResourcegtgtt<GeoDev>>
        get() = _ansvFromDevilgtgt





    private fun gtggtgtgt(key: String, data: String?) {
        val vfvvfvfvf = application.getSharedPreferences(
            Constantine.KEY_MAIN_FOR_SHARED_PREFgtgtt,
            Constantine.MODE_PRIVATE
        )
        val editable55 = vfvvfvfvf.edit()

        editable55.putString(key, data.toString())
        editable55.apply()
    }

    private fun uuuuu(key: String, defaultValue: String?): String? {
        val gggffgyju = application.getSharedPreferences(
            Constantine.KEY_MAIN_FOR_SHARED_PREFgtgtt,
            Constantine.MODE_PRIVATE
        )
        return gggffgyju.getString(key, defaultValue)
    }

    init {


        viewModelScope.launch(Dispatchers.IO) {
            getAdvertisingIdClient()
        }

    }

    fun vbhjjujuj() {
        gtgtttg.value = SortClassssss.LOADINGGG

        _appLinkDataaaagttg.value =
            uuuuu(Constantine.KEY_SHARED_PREF_APPLINK_DATAgtgt, null)
        _appsFlyerDattaGottenfgt.value =
            uuuuu(Constantine.KEY_SHARED_PREF_APPS_FLY_DATAgtgt, null)
        _linkgtgt.value =
            uuuuu(Constantine.KEY_SHARED_PREF_LINKgtgt, Constantine.KEY_NOOOOO_DATAgtgtt)
        _advertisingIdClientgtgt.value =
            uuuuu(
                Constantine.KEY_SHARED_PREF_ADVERT_IDgtgt,
                Constantine.KEY_NOOOOO_DATAgtgtt
            )

        _ansvFromGeoServicehyhy.value = DataFromApiResourcegtgtt.Loading()
        _ansvFromDevilgtgt.value = DataFromApiResourcegtgtt.Loading()
    }

    fun jukoloplpl(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                gtggtgtgt(
                    Constantine.KEY_SHARED_PREF_APPLINK_DATAgtgt,
                    it.targetUri.host.toString()
                )
                _appLinkDataaaagttg.postValue(it.targetUri.host.toString())

            }
            if (appLinkData == null) {
                if (appLinkDataaaaaa.value == null) {
                    gtggtgtgt(Constantine.KEY_SHARED_PREF_APPLINK_DATAgtgt, "null")
                    _appLinkDataaaagttg.postValue("null")
                }
            }
        }
    }

    fun gtgttgt(): DataForVebVievgtttgt {
        gtggtgtgt(
            Constantine.KEY_SHARED_PREF_ADVERT_IDgtgt,
            advertisingIdClientgttggt.value.toString()
        )
        gtggtgtgt(Constantine.KEY_SHARED_PREF_LINKgtgt, linkggg.value.toString())
        gtggtgtgt(Constantine.KEY_SHARED_PREF_APPLINK_DATAgtgt, appLinkDataaaaaa.value.toString())
        gtggtgtgt(
            Constantine.KEY_SHARED_PREF_APPS_FLY_DATAgtgt, appsFlyerDattaGottengtt.value.toString()
        )

        return DataForVebVievgtttgt(
            vbggbbgbg = appsFlyerDattaGottengtt.value.toString(),
            bgggbg = advertisingIdClientgttggt.value.toString(),
            bgbbgbg = appLinkDataaaaaa.value.toString(),
            jujjuuj = linkggg.value.toString()
        )
    }


    suspend fun bgbgbgbg() {


        val hyhyhyhy = ansvFromDevilgtgt.value?.data?.appsChecker ?: "99"

        val jujikffffg = ansvFromGeoServicejuujuj.value?.data?.countryCode ?: "noop"

        val vbhnjkkk = ansvFromDevilgtgt.value?.data?.geo ?: "none"

        when (hyhyhyhy) {

            "1" -> {

                var vfvfvfvf = uuuuu(Constantine.KEY_SHARED_PREF_APPS_FLY_DATAgtgt, null)
                var hnhjjjj = uuuuu(Constantine.KEY_SHARED_PREF_APPLINK_DATAgtgt, null)
                while (true) {

                    if (vfvfvfvf != null && hnhjjjj != null) {

                        vfvfvfvf = _appsFlyerDattaGottenfgt.value
                        hnhjjjj = appLinkDataaaaaa.value

                        gtggtgtgt(Constantine.KEY_SHARED_PREF_APPLINK_DATAgtgt, hnhjjjj)
                        _appLinkDataaaagttg.postValue(hnhjjjj)

                        gtggtgtgt(Constantine.KEY_SHARED_PREF_APPS_FLY_DATAgtgt, vfvfvfvf)
                        _appsFlyerDattaGottenfgt.postValue(vfvfvfvf)

                        if (
                            hnhjjjj!!.contains(Constantine.KEY_TDB2gtgt) || vfvfvfvf!!.contains(
                                Constantine.KEY_TDB2gtgt
                            ) || vbhnjkkk.contains(jujikffffg)
                        ) {
                            gtgtttg.postValue(SortClassssss.REAL_STARTTT)
                        } else {
                            gtgtttg.postValue(SortClassssss.MODERATIONN)
                        }

                        break
                    } else {
                        delay(1000)
                        if (vfvfvfvf == null) {
                            vfvfvfvf =
                                uuuuu(Constantine.KEY_SHARED_PREF_APPS_FLY_DATAgtgt, null)
                        }
                        if (hnhjjjj == null) {
                            hnhjjjj =
                                uuuuu(Constantine.KEY_SHARED_PREF_APPLINK_DATAgtgt, null)
                        }
                    }
                }
            }
            "55" -> {
                gtgtttg.postValue(SortClassssss.TEST_VEBVBB)
            }
            else -> {
                if (vbhnjkkk.contains(jujikffffg)) {
                    CoroutineScope(Dispatchers.IO).launch {
                        while (true) {
                            if (appLinkDataaaaaa.value != null) {
                                val vvbbddddff =
                                    appLinkDataaaaaa.value ?: Constantine.KEY_NOOOOO_DATAgtgtt
                                if (vvbbddddff.contains(
                                        Constantine.KEY_TDB2gtgt
                                    ) || vbhnjkkk.contains(jujikffffg)
                                ) {
                                    gtgtttg.postValue(SortClassssss.REAL_START_NO_APPSSS)
                                } else {
                                    gtgtttg.postValue(SortClassssss.MODERATIONN)
                                }
                                break
                            } else {
                                delay(1000)
                            }
                        }
                    }
                } else {
                    gtgtttg.postValue(SortClassssss.MODERATIONN)
                }
            }
        }
    }

    fun bbgbgbgbg(context: Context) {
        AppsFlyerLib.getInstance()
            .init("dFPt72WU5SCG33464ob5Ka", conversionDataListener, application)
        AppsFlyerLib.getInstance().start(context)
    }

    suspend fun uuuuuuioo() {
        val frgtg = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(DevilApiifrfrrrf::class.java)

        try {
            val result = frgtg.getData()
            if (result.isSuccessful) {

                val cooode = result.body()


                _ansvFromGeoServicehyhy.postValue(DataFromApiResourcegtgtt.Success(data = cooode))

                cvfdssdd()
            }

        } catch (e: Exception) {
            _ansvFromGeoServicehyhy.postValue(DataFromApiResourcegtgtt.Error(message = e.message.toString()))
        }
    }

    private suspend fun cvfdssdd() {
//        val apiResponse = Retrofit.Builder()
//            .addConverterFactory(GsonConverterFactory.create())
//            .baseUrl("http://rapturingflame.xyz/")
//            .build()
//            .create(DevilApiifrfrrrf::class.java)

        if (RetrofitCreater.apiDevil.getDataDev().isSuccessful) {

            val result = RetrofitCreater.apiDevil.getDataDev().body()!!

            val responseVeiv = result.view

            _linkgtgt.postValue(responseVeiv)

            _ansvFromDevilgtgt.postValue(DataFromApiResourcegtgtt.Success(data = result))

        } else {
            _ansvFromDevilgtgt.postValue(DataFromApiResourcegtgtt.Error(message = "error during loading"))
        }

        while (true) {
            if (_ansvFromDevilgtgt.value is DataFromApiResourcegtgtt.Success) {
                bgbgbgbg()
                break
            } else {
                delay(1000)
            }
        }
    }


    private fun getAdvertisingIdClient() {
        val advertisingIdClient = AdvertisingIdClient(application)
        advertisingIdClient.start()
        val idUserAdvertising = advertisingIdClient.info.id ?: Constantine.KEY_NOOOOO_DATAgtgtt

        _advertisingIdClientgtgt.postValue(idUserAdvertising)

    }


    val conversionDataListener = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            tempApsData = dataGotten
            _appsFlyerDattaGottenfgt.postValue(dataGotten)
            gtggtgtgt(Constantine.KEY_SHARED_PREF_APPS_FLY_DATAgtgt, dataGotten)


        }

        override fun onConversionDataFail(p0: String?) {

        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }
}