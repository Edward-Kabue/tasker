package com.mytasks.app.modules.termsandconditions.`data`.model

import com.mytasks.app.R
import com.mytasks.app.appcomponents.di.MyApp
import kotlin.String

data class TermsandconditionsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_and_conditions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor2)

)
