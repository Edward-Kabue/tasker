package com.mytasks.app.modules.tasker.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.mytasks.app.R
import com.mytasks.app.appcomponents.base.BaseActivity
import com.mytasks.app.databinding.ActivityTaskerBinding
import com.mytasks.app.modules.loginorsignup.ui.LoginOrSignupActivity
import com.mytasks.app.modules.tasker.`data`.viewmodel.TaskerVM
import kotlin.String
import kotlin.Unit

class TaskerActivity : BaseActivity<ActivityTaskerBinding>(R.layout.activity_tasker) {
  private val viewModel: TaskerVM by viewModels<TaskerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.taskerVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LoginOrSignupActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.imageLogo.setOnClickListener {
        val destIntent = LoginOrSignupActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "TASKER_ACTIVITY"

    }
  }
