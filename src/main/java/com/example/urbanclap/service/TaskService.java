package com.example.urbanclap.service;

import java.util.List;

import com.example.urbanclap.dto.request.TaskReq;
import com.example.urbanclap.entities.Task;

public interface TaskService {

    List<Task> getAllTasks();
    TaskReq createNewTask(TaskReq task);
}
