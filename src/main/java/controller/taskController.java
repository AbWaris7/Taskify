package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.taskifyService;

@Controller
public class taskController {

    private final taskifyService service;
    @Autowired
    public taskController(taskifyService service) {
        this.service = service;
    }
}
