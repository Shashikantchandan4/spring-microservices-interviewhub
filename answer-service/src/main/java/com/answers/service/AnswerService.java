package com.answers.service;

import com.answers.entity.Answer;
import com.answers.repository.AnswerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnswerService {

    private final AnswerRepository repository;

    public AnswerService(AnswerRepository repository) {
        this.repository = repository;
    }

    public Answer save(Answer answer) {
        return repository.save(answer);
    }

    public List<Answer> getAnswersByQuestionId(Long questionId) {
        return repository.findByQuestionId(questionId);
    }
}
