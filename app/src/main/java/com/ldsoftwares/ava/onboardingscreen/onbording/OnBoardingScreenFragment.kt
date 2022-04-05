package com.ldsoftwares.ava.onboardingscreen.onbording

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.ldsoftwares.ava.R
import com.ldsoftwares.ava.onboardingscreen.onbording.screens.ScreenOneFragment
import com.ldsoftwares.ava.onboardingscreen.onbording.screens.ScreenThreeFragment
import com.ldsoftwares.ava.onboardingscreen.onbording.screens.ScreenTwoFragment
import com.ldsoftwares.ava.onboardingscreen.onbording.viewpageradapter.ViewPagerAdapter

class OnBoardingScreenFragment : Fragment() {

    private lateinit var mListOfFragments: ArrayList<Fragment>
    private lateinit var mViewPager: ViewPager2

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mListOfFragments = arrayListOf<Fragment>(
            ScreenOneFragment(),
            ScreenTwoFragment(),
            ScreenThreeFragment()
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View =  inflater.inflate(R.layout.fragment_onboarding_screen, container, false)

        val viewPagerAdapter: ViewPagerAdapter = ViewPagerAdapter(
            mListOfFragments,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        mViewPager = view.findViewById(R.id.vp_on_boarding_screen_fragment)
        mViewPager.adapter = viewPagerAdapter

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDetach() {
        super.onDetach()
    }

}