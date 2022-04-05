package com.ldsoftwares.ava.onboardingscreen.repositories

import android.content.res.Resources
import android.os.Build
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.FragmentActivity

object OnBoardingRepositories {
    fun updateStatusNavigationBarColor(
        requireActivity: FragmentActivity, resources: Resources, color: Int) {
        if (Build.VERSION.SDK_INT >= 23) {
            requireActivity.window.statusBarColor = ResourcesCompat.getColor(resources, color, null)
            requireActivity.window.navigationBarColor = ResourcesCompat.getColor(resources, color, null)
        }
    }
}