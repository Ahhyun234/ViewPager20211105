package com.nepplus.viewpager20211105.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.viewpager20211105.pragments.HelloFragment
import com.nepplus.viewpager20211105.pragments.IntroduceFragment
import com.nepplus.viewpager20211105.pragments.NameFragment

class MainViewPagerAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        if (position==0 ){
            return HelloFragment()
        }
        else if (position == 1) {
            return NameFragment()
        }

        else{
            return IntroduceFragment()
        }
    }
}