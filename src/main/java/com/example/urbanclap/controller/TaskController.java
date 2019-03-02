package com.example.urbanclap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.urbanclap.dto.request.TaskReq;
import com.example.urbanclap.entities.Task;
import com.example.urbanclap.enums.TaskStatus;
import com.example.urbanclap.service.impl.TaskServiceImpl;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@RequestMapping("v1/tasks")
public class TaskController {

    @Autowired
    private TaskServiceImpl taskService;

    @GetMapping
    @ApiOperation(value = "Get All tasks ", response = List.class)
    public ResponseEntity<List<Task>> getTasks() {

        List<Task> tasks = taskService.getAllTasks();

        return new ResponseEntity<List<Task>>(tasks, HttpStatus.OK);
    }

    @PostMapping
    @ApiOperation(value = "Post tasks ", response = TaskReq.class)
    public ResponseEntity<TaskReq> addTask(@RequestBody TaskReq taskReq) {

        return new ResponseEntity<TaskReq>(taskService.createNewTask(taskReq), HttpStatus.ACCEPTED);
    }

    @PutMapping(path = "/{id}")
    @ApiOperation(value = "Update task rating", response = TaskReq.class)
    public ResponseEntity<Task> updateRating(@PathVariable("id") Long id, @RequestBody TaskReq taskReq) {

        return new ResponseEntity<Task>(taskService.updateRating(id, taskReq), HttpStatus.ACCEPTED);
    }

    @PutMapping(path = "/{id}/status")
    @ApiOperation(value = "Update task status ", response = TaskReq.class)
    public ResponseEntity<Task> updateStatus(@PathVariable("id") Long id, @RequestParam TaskStatus status) {

        return new ResponseEntity<Task>(taskService.updateStatus(id, status), HttpStatus.ACCEPTED);
    }
}
