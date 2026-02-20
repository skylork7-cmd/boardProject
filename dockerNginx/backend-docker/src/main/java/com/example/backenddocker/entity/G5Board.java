package com.example.backenddocker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "g5_board")
@Getter
public class G5Board {

    @Id
    @Column(name = "bo_table")
    private String boTable;

    @Column(name = "gr_id")
    private String grId;

    @Column(name = "bo_subject")
    private String boSubject;
}

