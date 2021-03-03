package com.afarelramdani.movieapps.Activity.onboarding

import android.os.Bundle
import com.afarelramdani.movieapps.Base.BaseActivity
import com.afarelramdani.movieapps.R
import com.afarelramdani.movieapps.databinding.ActivityOnBoardingOneBinding

class OnBoardingOneActivity : BaseActivity<ActivityOnBoardingOneBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setLayout = R.layout.activity_on_boarding_one
        super.onCreate(savedInstanceState)
    }
}