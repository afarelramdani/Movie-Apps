package com.afarelramdani.movieapps.Activity.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.afarelramdani.movieapps.Base.BaseActivity
import com.afarelramdani.movieapps.R
import com.afarelramdani.movieapps.databinding.ActivityDetailMovieBinding

class DetailMovieActivity : BaseActivity<ActivityDetailMovieBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setLayout = R.layout.activity_detail_movie
        super.onCreate(savedInstanceState)
    }
}