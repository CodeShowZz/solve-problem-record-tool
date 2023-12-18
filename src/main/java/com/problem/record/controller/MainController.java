package com.problem.record.controller;

import com.problem.record.mapper.ProblemRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-18 16:57
 */
@RestController
@RequestMapping(path = "/demo")
public class MainController {

    @Autowired
    private ProblemRecordRepository problemRecordRepository;

    @PostMapping(path = "/add") // Map ONLY POST Requests
    public @ResponseBody
    String add() {
        return "Saved";
    }
}