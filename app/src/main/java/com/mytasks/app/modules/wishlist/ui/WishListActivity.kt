package com.mytasks.app.modules.wishlist.ui

import androidx.activity.viewModels
import com.mytasks.app.R
import com.mytasks.app.appcomponents.base.BaseActivity
import com.mytasks.app.databinding.ActivityWishListBinding
import com.mytasks.app.modules.signup.ui.SignupActivity
import com.mytasks.app.modules.wishlist.`data`.viewmodel.WishListVM
import kotlin.String
import kotlin.Unit

class WishListActivity : BaseActivity<ActivityWishListBinding>(R.layout.activity_wish_list) {
  private val viewModel: WishListVM by viewModels<WishListVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.wishListVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnMakeAWishList.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnArrowLeft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "WISH_LIST_ACTIVITY"

  }
}
