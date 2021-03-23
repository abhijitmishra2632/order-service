package com.cosmos.service;

import com.cosmos.model.IdSequence;
import com.cosmos.repository.IdSequenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdSequenceService {
    @Autowired
    private IdSequenceRepository idSequenceRepository;
    public long getNext() {
        IdSequence last = idSequenceRepository.findTopByOrderByIdDesc();
        long lastNum = last.seq;
        IdSequence next = new IdSequence(lastNum + 1);
        idSequenceRepository.save(next);
        return next.seq;
    }
}
