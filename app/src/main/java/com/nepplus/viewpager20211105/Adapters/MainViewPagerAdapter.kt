package com.nepplus.viewpager20211105.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.viewpager20211105.pragments.HelloFragment
import com.nepplus.viewpager20211105.pragments.IntroduceFragment
import com.nepplus.viewpager20211105.pragments.NameFragment

class MainViewPagerAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {
//  //함수의 결과가 한줄로 끝나면 = 로 결과 대입 가능
    override fun getCount()=3

    override fun getItem(position: Int): Fragment {

     return when(position){
         0-> HelloFragment()
         1-> NameFragment()
         else -> IntroduceFragment()

     }
    }
}