package controller;

import model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.taskifyService;

import java.util.List;

@Controller
public class taskController {

    private final taskifyService service;
    @Autowired
    public taskController(taskifyService service) {
        this.service = service;
    }

    @GetMapping()
    public String getTasks(Model model) {

        List<Task> tasks = service.getAllTasks();
        model.addAttribute("tasks", tasks);

        return "tasks";
    }
}
