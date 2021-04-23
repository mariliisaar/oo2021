package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.entities.Task;
import com.example.demo.entities.User;
import com.example.demo.entities.repositories.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/todo")
    public String showTasks(Model model) {
        model.addAttribute("tasks", taskRepository.findAll());
        return "todo";
    }

    @GetMapping("/addtask")
    public String showAddTask(Task task, User user) {
        return "addtask";
    }

    @PostMapping("/saveTask")
    public String saveTask(@Valid Task task, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addtask";
        }

        taskRepository.save(task);
        return "redirect:/todo";
    }

    @GetMapping("/edittask/{id}")
    public String showTaskUpdate(@PathVariable("id") long id, Model model) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Cannot find task with id: " + id));
        model.addAttribute("task", task);
        return "updatetask";
    }

    @PostMapping("/updatetask/{id}")
    public String updateTask(@PathVariable("id") long id, @Valid Task task, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "updatetask";
        }
        taskRepository.save(task);
        return "redirect:/todo";
    }

    @GetMapping("/deletetask/{id}")
    public String deleteTask(@PathVariable("id") long id, Model model) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Cannot find task with id: " + id));
        taskRepository.delete(task);
        return "redirect:/todo";
    }

    @GetMapping("/completetask/{id}")
    public String completeTask(@PathVariable("id") long id, Model model) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Cannot find task with id: " + id));
        task.toggleCompleted();
        taskRepository.save(task);
        return "redirect:/todo";
    }
}
