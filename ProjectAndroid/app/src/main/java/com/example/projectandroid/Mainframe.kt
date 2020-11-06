package com.example.projectandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectandroid.R
import kotlinx.android.synthetic.main.activity_mainframe.*

class Mainframe : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainframe)


        bt_navigation.setOnNavigationItemSelectedListener() {

            when(it.itemId){
                R.id.item_home -> {
                    supportFragmentManager.beginTransaction().apply{
                        val fragHome =
                            Fragmentmain()
                        replace(R.id.fragment_container, fragHome)
                        commit()
                    }
                    it.setIcon(R.drawable.home).isChecked = true
                    true
                }
                R.id.item_bed -> {
                    supportFragmentManager.beginTransaction().apply {
                        val fragBed =
                            FragmentBed()
                        replace(R.id.fragment_container,fragBed)
                        commit()
                    }
                    it.setIcon(R.drawable.bed).isChecked = true
                }
                R.id.item_info ->{
                    supportFragmentManager.beginTransaction().apply{
                        val fragInfo =
                            FragmentInfo()
                        replace(R.id.fragment_container,fragInfo)
                        commit()
                    }
                    it.setIcon(R.drawable.user).isChecked = true
                    true
                }
            }
            false
        }
        supportFragmentManager.beginTransaction().replace(
            R.id.fragment_container,
            Fragmentmain()
        ).commit()
    }
}