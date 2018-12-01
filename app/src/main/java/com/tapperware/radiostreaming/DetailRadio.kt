package com.tapperware.radiostreaming

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_detail_radio.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class DetailRadio : AppCompatActivity() {

    lateinit var player: MediaPlayer
    var url : String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_radio)

        var posisi = 0
        url = intent.getStringExtra("urlNasional")


        progressBar.isIndeterminate = false
        progressBar.visibility = View.INVISIBLE
        progressBar.max = 100

        setPlaying()

        playButton.isEnabled = true
        pauseButton.isEnabled = false

        playButton.onClick {
            setPlaying()
            progressBar.isIndeterminate = true
            progressBar.visibility = View.VISIBLE
            player.prepareAsync()
            player.setOnPreparedListener {
                player -> player.start()
                progressBar.isIndeterminate = false

            }

            playButton.isEnabled = false
            pauseButton.isEnabled = true

        }

        pauseButton.onClick {
            if(player.isPlaying()){
                posisi = player.getCurrentPosition()
                player.stop()

                playButton.isEnabled = true
                pauseButton.isEnabled = false
            }

        }

    }

    private fun setPlaying() {
        player = MediaPlayer()
        player.setDataSource(url)
        player.setOnBufferingUpdateListener { mediaPlayer, i ->
            progressBar.isIndeterminate = true
            progressBar.secondaryProgress = 100
        }


    }
}
