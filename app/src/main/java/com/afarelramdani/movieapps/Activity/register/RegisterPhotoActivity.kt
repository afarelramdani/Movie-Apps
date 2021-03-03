package com.afarelramdani.movieapps.Activity.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.afarelramdani.movieapps.Base.BaseActivity
import com.afarelramdani.movieapps.R
import com.afarelramdani.movieapps.databinding.ActivityRegisterPhotoBinding

class RegisterPhotoActivity : BaseActivity<ActivityRegisterPhotoBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setLayout = R.layout.activity_register_photo
        super.onCreate(savedInstanceState)
    }
}