package com.Deisha.TaskTrackerCLI.Model;

import org.springframework.scheduling.config.Task;

public class TaskTracker {
    private String taskId;
    private String taskDescription;
    private int status;
    private String taskDateCreated;
    private String taskUpdatedDate;

    public TaskTracker(){
    }

    public TaskTracker(String taskId, String taskDescription, int status, String taskDateCreated, String taskUpdatedDate){

        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.status = status;
        this.taskDateCreated = taskDateCreated;
        this.taskUpdatedDate = taskUpdatedDate;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTaskDateCreated() {
        return taskDateCreated;
    }

    public void setTaskDateCreated(String taskDateCreated) {
        this.taskDateCreated = taskDateCreated;
    }

    public String getTaskUpdatedDate() {
        return taskUpdatedDate;
    }

    public void setTaskUpdatedDate(String taskUpdatedDate) {
        this.taskUpdatedDate = taskUpdatedDate;
    }
}
