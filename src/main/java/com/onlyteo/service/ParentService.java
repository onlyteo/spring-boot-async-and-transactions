package com.onlyteo.service;

import com.onlyteo.model.Parent;
import com.onlyteo.repository.ParentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentService {

    private final ParentRepository parentRepository;

    public ParentService(final ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }

    public List<Parent> findParents() {
        return parentRepository.findAll();
    }
}
