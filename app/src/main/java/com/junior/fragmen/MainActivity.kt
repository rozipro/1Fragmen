package com.junior.fragmen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentSatu = Fragmentsatu()
        val fragment: Fragment? = supportFragmentManager.findFragmentByTag(fragmentSatu::class.java.simpleName)
        if(fragment !is Fragmentsatu){
            supportFragmentManager.beginTransaction().add(R.id.frame_container, fragmentSatu,Fragmentsatu::class.java.simpleName).commit()
        }
    }
}
