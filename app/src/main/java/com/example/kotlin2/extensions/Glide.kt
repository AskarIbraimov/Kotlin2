package com.example.kotlin2.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide
import java.net.URI


fun ImageView.glide(uri: String){
    Glide.with(this).load(uri).into(this)
}