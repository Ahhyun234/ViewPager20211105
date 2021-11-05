package com.nepplus.viewpager20211105

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.viewpager20211105.Adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mnpa: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpEvent()
        setValues()

    }

    fun setUpEvent(){}

    fun setValues(){

        mnpa = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mnpa
    }
}