package com.example.afinal

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val adapter = MyViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(FragmentOne(), "One")
        adapter.addFragment(FragmentTwo(), "Two")
        adapter.addFragment(FragmentThree(), "Three")

        viewPager.adapter = adapter
        


    }

    class MyViewPagerAdapter(manager:FragmentManager):FragmentPagerAdapter(manager){

        private val  fragmentList :MutableList<Fragment> = ArrayList()
        private val  titleList:MutableList<String> = ArrayList()



        override fun getCount(): Int {
            return fragmentList.size
        }

        override fun getItem(position: Int): Fragment {
           return fragmentList[position]
        }

        fun addFragment(fragment: Fragment, title:String){

            fragmentList.add(fragment)
            titleList.add(title)

        }

        override fun getPageTitle(position: Int): CharSequence? {
            return titleList[position]
        }


    }


}