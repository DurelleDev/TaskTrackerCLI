package com.Deisha.TaskTrackerCLI.Controller;

import com.Deisha.TaskTrackerCLI.Model.TaskTracker;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasktracker")
public class TaskTrackerAPIService {

    TaskTracker taskTracker;

    @GetMapping("{taskId}")
    public TaskTracker getTaskTrackerDetails(String taskId){
        return this.taskTracker;
    }


    @PostMapping
    public String createTaskDetail(@RequestBody TaskTracker taskTracker){
        this.taskTracker = taskTracker;

        if(this.taskTracker == null)
            System.out.println("Failed to create task!");

        return "Success! Created a task";
    }
}
