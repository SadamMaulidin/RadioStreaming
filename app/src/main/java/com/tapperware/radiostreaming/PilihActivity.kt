package com.tapperware.radiostreaming

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tapperware.radiostreaming.R.id.btnInternasional
import com.tapperware.radiostreaming.R.id.btnNasional
import kotlinx.android.synthetic.main.activity_pilih.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.startActivity

class PilihActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilih)


        btnNasional.setOnClickListener{
            val pindah = Intent(this, NasionalActivity::class.java)
            startActivity(pindah)
        }

        btnInternasional.setOnClickListener{
            val pindah = Intent(this, InternasionalActivity::class.java)
            startActivity(pindah)
        }

    }
}
