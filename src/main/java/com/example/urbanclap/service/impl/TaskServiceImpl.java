package com.example.urbanclap.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.urbanclap.dto.request.TaskReq;
import com.example.urbanclap.entities.Task;
import com.example.urbanclap.entities.User;
import com.example.urbanclap.enums.TaskStatus;
import com.example.urbanclap.repository.TaskRepository;
import com.example.urbanclap.service.TaskService;
import com.example.urbanclap.util.mapper.TaskMapper;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAllByOrderByCreatedTime();
    }
    
    public List<Task> getAllNearest(Double lat,Double lng) {
        return taskRepository.findAllOrderByLoc(lat, lng);
    }
    
    public List<Task> getAllTasksByFilter(TaskStatus status) {
        return taskRepository.findAllByStatusOrderByCreatedTime(status);
    }

    @Override
    public TaskReq createNewTask(TaskReq task) {

        Task newTask = TaskMapper.taskReqToEntity(task);
        taskRepository.save(newTask);
        return task;
    }

    public Task acceptTask(Long taskId,User worker) {

        Optional<Task> task = taskRepository.findById(taskId);
        if (!task.isPresent()) {
            throw new RuntimeException("task not found");
        }
        task.get().setStatus(TaskStatus.ONGOING);
        task.get().setAssignedTo(worker);
        return taskRepository.save(task.get());
    }
    
    public Task updateStatus(Long taskId,TaskStatus status) {

        Optional<Task> task = taskRepository.findById(taskId);
        if (!task.isPresent()) {
            throw new RuntimeException("task not found");
        }
        task.get().setStatus(status);
        return taskRepository.save(task.get());
    }

    public Task updateRating(Long taskId, TaskReq req) {

        Optional<Task> task = taskRepository.findById(taskId);
        if (!task.isPresent()) {
            throw new RuntimeException("task not found");
        }
        task.get().setRating(req.getRating());
        return taskRepository.save(task.get());
    }

}
