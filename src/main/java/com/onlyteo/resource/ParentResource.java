package com.onlyteo.resource;

import com.onlyteo.model.Parent;
import com.onlyteo.service.ParentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "parents")
@RestController
public class ParentResource {

    private final ParentService parentService;

    public ParentResource(final ParentService parentService) {
        this.parentService = parentService;
    }

    @GetMapping
    public ResponseEntity<List<Parent>> find() {
        List<Parent> parents = parentService.findParents();
        return ResponseEntity.ok(parents);
    }
}
