package br.com.heiderlopes.democustomview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import br.com.heiderlopes.democustomview.loadingbutton.LoadingButton
import br.com.heiderlopes.democustomview.loadingbuttonanimated.LoadingButtonAnimated

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<LoadingButtonAnimated>(R.id.button)

        button.setOnClickListener {
            button.startAnimation()
            Handler(Looper.getMainLooper()).postDelayed({
                button.revertAnimation()
            }, 2000)
        }

        val btLoadingButton = findViewById<LoadingButton>(R.id.btLoadingButton)

        btLoadingButton.setOnClickListener {
            btLoadingButton.setLoading(true)
            Handler(Looper.getMainLooper()).postDelayed({
                btLoadingButton.setLoading(false)
            }, 2000)
        }

    }
}