package com.example.bit_pixnews

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.github.appintro.AppIntro
import com.github.appintro.AppIntroFragment

class AppIntroNews : AppIntro() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_app_intro)

        addSlide(
            AppIntroFragment.newInstance(
                title = "Welcome",
                description = "Bit-Pix News by Ujjwal",
                imageDrawable = R.drawable.new_article1,
                titleColor = Color.YELLOW,
                descriptionColor = Color.RED,
                backgroundColor = R.drawable.fdhbdfhfhth
            )
        )
    }

    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        // Decide what to do when the user clicks on "Skip"
        startActivity(
            Intent(
                applicationContext,
                MainActivity::class.java
            ).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        )
    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        // Decide what to do when the user clicks on "Done"
        startActivity(
            Intent(
                applicationContext,
                MainActivity::class.java
            ).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        )
    }
}