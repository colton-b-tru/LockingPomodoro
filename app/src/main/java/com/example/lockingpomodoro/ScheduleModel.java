package com.example.lockingpomodoro;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ScheduleModel extends AndroidViewModel {
    private ScheduleRepository repository;
    private LiveData<List<Task>> allTasks;

    public ScheduleModel(Application application){
        super(application);
        repository = new ScheduleRepository(application);
        allTasks = repository.getAllTasks();
    }

    LiveData<List<Task>> getAllTasks() { return allTasks; }

    public void insert(Task task) { repository.insert(task); }



}
