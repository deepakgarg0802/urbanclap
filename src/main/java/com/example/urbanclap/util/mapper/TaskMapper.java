package com.example.urbanclap.util.mapper;

import java.time.LocalDateTime;

import com.example.urbanclap.dto.request.TaskReq;
import com.example.urbanclap.entities.Task;
import com.example.urbanclap.enums.TaskStatus;

public class TaskMapper {

    public static Task taskReqToEntity(TaskReq req) {
        Task task= new Task();
        task.setName(req.getName());
        task.setCategory(req.getCategory());
        task.setDateTime(LocalDateTime.now());
        task.setDescription(req.getDescription());
        task.setStatus(TaskStatus.NEW);
        task.setGPlusLocation(req.getLocation());
        
        return task;
    }
}
