package pl.pasiekarodosna.menadzerpasieki.Activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import pl.pasiekarodosna.menadzerpasieki.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        
            }

    override fun onStart() {
        super.onStart()

        val r = Runnable {

            startActivity(Intent(this, KonsolaActivity::class.java))
            finish()
        }
        val h = Handler()

        h.postDelayed(r, 100)


    }


    }






