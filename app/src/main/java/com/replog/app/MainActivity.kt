package com.replog.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.rgb(18, 20, 24))
        }

        val title = TextView(this).apply {
            text = "RepLog"
            textSize = 32f
            setTextColor(Color.rgb(100, 230, 150))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Il tuo allenamento, sotto controllo."
            textSize = 16f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val button = Button(this).apply {
            text = "Inizia allenamento"
            setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "RepLog è pronto per il prossimo step!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(
            button,
            LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            ).apply { topMargin = 32 }
        )

        setContentView(layout)
    }
}
