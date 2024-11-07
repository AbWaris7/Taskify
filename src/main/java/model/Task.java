package model;

import jakarta.persistence.*;
import lombok.Data;


@Entity(name = "Task")
@Data // use lombok to reduce boilerplate code (setter/getter)
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private boolean completed;
}
