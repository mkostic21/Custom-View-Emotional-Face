package com.raywenderlich.emotionalface

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.raywenderlich.emotionalface.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.happyButton.setOnClickListener {
      binding.emotionalFaceView.happinessState = EmotionalFaceView.HAPPY
    }

    binding.sadButton.setOnClickListener {
      binding.emotionalFaceView.happinessState = EmotionalFaceView.SAD
    }
  }
}
