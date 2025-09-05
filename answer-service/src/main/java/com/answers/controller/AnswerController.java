package com.answers.controller;

import com.answers.entity.Answer;
import com.answers.service.AnswerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/answers")
public class AnswerController {

    private final AnswerService service;

    public AnswerController(AnswerService service) {
        this.service = service;
    }

    @PostMapping
    public Answer addAnswer(@RequestBody Answer answer) {
        return service.save(answer);
    }

    @GetMapping("/question/{questionId}")
    public List<Answer> getAnswers(@PathVariable Long questionId) {
        return service.getAnswersByQuestionId(questionId);
    }
}
