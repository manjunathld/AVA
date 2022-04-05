package com.ldsoftwares.ava.onboardingscreen.onbording.viewpageradapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    listOfFragments: ArrayList<Fragment>,
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle)
    : FragmentStateAdapter(fragmentManager, lifecycle) {

    private lateinit var mListOfFragments: ArrayList<Fragment>

    init {
        mListOfFragments = listOfFragments
    }

    override fun createFragment(position: Int): Fragment {
        return mListOfFragments[position]
    }

    override fun getItemCount(): Int {
        if (::mListOfFragments.isInitialized) {
            return mListOfFragments.size
        } else {
            return 0
        }
    }
}
