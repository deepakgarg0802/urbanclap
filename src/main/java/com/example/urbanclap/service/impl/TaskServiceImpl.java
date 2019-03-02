package com.example.urbanclap.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.urbanclap.dto.request.TaskReq;
import com.example.urbanclap.entities.Task;
import com.example.urbanclap.repository.TaskRepository;
import com.example.urbanclap.service.TaskService;
import com.example.urbanclap.util.mapper.TaskMapper;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;
    
    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    
    @Override
    public TaskReq createNewTask(TaskReq task) {
        
        Task newTask= TaskMapper.taskReqToEntity(task);
        taskRepository.save(newTask);
        return task;
    }
}
