package com.afarelramdani.movieapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.afarelramdani.movieapps.Base.BaseActivity
import com.afarelramdani.movieapps.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : BaseActivity<ActivitySplashScreenBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setLayout = R.layout.activity_splash_screen
        super.onCreate(savedInstanceState)
    }
}