package com.example.backenddocker.service;

import com.example.backenddocker.entity.G5Board;
import com.example.backenddocker.repository.G5BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class G5BoardService {

    private final G5BoardRepository repository;

    public List<G5Board> findAll() {
        return repository.findAll();
    }
}
