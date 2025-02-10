package com.example.todo.entity;

import com.example.member.entity.Member;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;


@Entity
public class Todo extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "longtext")
    private String content;
}
