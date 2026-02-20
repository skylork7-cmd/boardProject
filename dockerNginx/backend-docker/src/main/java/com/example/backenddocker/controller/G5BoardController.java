package com.example.backenddocker.controller;

import com.example.backenddocker.entity.G5Board;
import com.example.backenddocker.service.G5BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class G5BoardController {

    private final G5BoardService service;

    @GetMapping
    public List<G5Board> getBoards() {
        return service.findAll();
    }
}
