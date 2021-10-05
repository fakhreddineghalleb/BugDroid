package tn.esprit.bugdroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        title = "Linear Layout"
//        setContentView(R.layout.activity_linear)

//        title = "Relative Layout"
//        setContentView(R.layout.activity_relative)

        title = "ConstraintLayout"
        setContentView(R.layout.activity_contraint)
    }
}