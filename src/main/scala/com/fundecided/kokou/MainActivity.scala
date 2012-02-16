package com.fundecided.kokou

import android.app.Activity
import android.os.Bundle
import android.view.animation.AnimationUtils

import com.fundecided.kokou._

class MainActivity extends Activity with TypedActivity {
  lazy val droidImage = findView(TR.droidImage)

  override def onCreate(bundle: Bundle) {
    super.onCreate(bundle)
    setContentView(R.layout.main)

    droidImage.onClick {
      val boundEffect = AnimationUtils.loadAnimation(this, R.anim.bound_effect)
      droidImage.startAnimation(boundEffect)
    }
  }
}
