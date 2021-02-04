package ir.javadsh.todomvvm.ui.tasks

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import ir.javadsh.todomvvm.data.TaskDao

class TaskViewModel @ViewModelInject constructor(
    private val taskDao: TaskDao
) : ViewModel() {
}