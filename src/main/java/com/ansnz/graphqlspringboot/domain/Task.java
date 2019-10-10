package com.ansnz.graphqlspringboot.domain;

import com.ansnz.graphqlspringboot.enums.Priority;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;
    String description;
    Priority priority;
    @OneToOne
    Project project;
}
