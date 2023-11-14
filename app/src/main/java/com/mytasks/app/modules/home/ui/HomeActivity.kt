package com.mytasks.app.modules.home.ui

import androidx.activity.viewModels
import com.mytasks.app.R
import com.mytasks.app.appcomponents.base.BaseActivity
import com.mytasks.app.databinding.ActivityHomeBinding
import com.mytasks.app.modules.home.`data`.viewmodel.HomeVM
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"

  }
}
