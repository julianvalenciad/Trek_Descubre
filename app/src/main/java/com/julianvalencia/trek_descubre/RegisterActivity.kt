package com.julianvalencia.trek_descubre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RegisterActivity : AppCompatActivity() {

    //private lateinit var registerBinding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  registerBinding = ActityResgisterBinding.inflate()
       // val view = registerBinding.root

        setContentView(R.layout.activity_register)
    }
}