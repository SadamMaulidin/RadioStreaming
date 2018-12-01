package com.tapperware.radiostreaming

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nasional.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.startActivity

class NasionalActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nasional)



        btnRadio1.onClick{
            startActivity<DetailRadio> ("urlNasional" to "http://ch1.rdiosilaturahim.com:8100/rasilm")

        }

        btnRadio2.onClick {
            startActivity<DetailRadio>("urlNasional" to "http://www.theglobalradio.com/player/audio")
        }

        btnRadio3.onClick {
            startActivity<DetailRadio>("urlNasional" to "http://101.50.0.77:8000/smartfm.aac")
        }

        btnRadio4.onClick {
            startActivity<DetailRadio>("urlNasional" to "http://live4.rs3fm.com:8000/annajiyah.m3u")
        }

    }
}
