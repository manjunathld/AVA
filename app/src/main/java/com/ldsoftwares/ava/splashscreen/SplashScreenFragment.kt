package com.ldsoftwares.ava.splashscreen

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ldsoftwares.ava.R
import com.ldsoftwares.ava.onboardingscreen.repositories.OnBoardingRepositories
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class SplashScreenFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Update StatusBar and NavigationBar color
        OnBoardingRepositories.updateStatusNavigationBarColor(
            requireActivity(),
            resources,
            R.color.purple_solid
        )
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_splash_screen, container, false)

        Executors.newSingleThreadScheduledExecutor().schedule({
                findNavController().navigate(R.id.action_splashScreenFragment_to_welComeScreenFragment)
            }, 3, TimeUnit.SECONDS)

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