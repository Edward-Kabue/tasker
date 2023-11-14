package com.mytasks.app.modules.tasker.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mytasks.app.modules.tasker.`data`.model.TaskerModel
import org.koin.core.KoinComponent

class TaskerVM : ViewModel(), KoinComponent {
  val taskerModel: MutableLiveData<TaskerModel> = MutableLiveData(TaskerModel())

  var navArguments: Bundle? = null
}
