package com.example.handleexceptiondemo.heavy;

import com.example.handleexceptiondemo.heavy.dto.HeavyResourceAddressOnly;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HeavyController {

    private final HeavyResourceRepository heavyResourceRepository = new HeavyResourceRepository();

    @PutMapping("/heavy-resource/{id}")
    public ResponseEntity<?> saveResource(@RequestBody HeavyResource heavyResource,
                                          @PathVariable Integer id) {
        heavyResourceRepository.save(heavyResource, id);
        return null;
    }

    @PatchMapping(value = "/heavy-resource/{id}")
    public ResponseEntity<?> partialUpdateName(@RequestBody HeavyResourceAddressOnly partialUpdate,
                                               @PathVariable("id") Integer id) {
        heavyResourceRepository.save(partialUpdate, id);
        return ResponseEntity.ok("Resource address updated");
    }


}
