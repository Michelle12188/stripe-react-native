package com.reactnativestripesdk

import android.content.res.Configuration
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.facebook.react.uimanager.ThemedReactContext

class GooglePayButtonView(private val context: ThemedReactContext) : FrameLayout(context) {
  private var buttonType: String? = null

  fun setType(type: String) {
    buttonType = type
  }

  private fun isNightMode(): Boolean {
    val nightModeFlags: Int = context.resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
    return nightModeFlags == Configuration.UI_MODE_NIGHT_YES
  }
}
