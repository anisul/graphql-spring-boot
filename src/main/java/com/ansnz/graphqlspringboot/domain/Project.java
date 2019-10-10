package com.ansnz.graphqlspringboot.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;
    String title;
}
