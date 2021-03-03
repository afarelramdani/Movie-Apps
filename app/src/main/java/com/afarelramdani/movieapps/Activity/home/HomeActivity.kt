package com.afarelramdani.movieapps.Activity.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.afarelramdani.movieapps.Base.BaseActivity
import com.afarelramdani.movieapps.R
import com.afarelramdani.movieapps.databinding.ActivityHomeBinding

class HomeActivity : BaseActivity<ActivityHomeBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setLayout = R.layout.activity_home
        super.onCreate(savedInstanceState)
    }
}