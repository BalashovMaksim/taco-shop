package com.balashovmaksim.taco.tacocloud.controllers;

import com.balashovmaksim.taco.tacocloud.dto.TacoCreateDto;
import com.balashovmaksim.taco.tacocloud.dto.TacoReadDto;
import com.balashovmaksim.taco.tacocloud.dto.TacoUpdateDto;
import com.balashovmaksim.taco.tacocloud.model.Taco;
import com.balashovmaksim.taco.tacocloud.repository.TacoRepository;
import com.balashovmaksim.taco.tacocloud.service.TacoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/tacos",
                produces = "application/json")
@RequiredArgsConstructor
public class TacoApiController {
    private final TacoService tacoService;

    @GetMapping("/all")
    public List<TacoReadDto> getAllTaco(){
        return tacoService.getAll();
    }

    @GetMapping("{id}")
    public TacoReadDto getTacoById(@PathVariable("id") Long id){
        return tacoService.getTacoById(id);
    }

    @PostMapping("/create")
    public TacoReadDto createTaco(@RequestBody TacoCreateDto tacoCreateDto){
        return tacoService.createTaco(tacoCreateDto);
    }

    @PutMapping("/{id}")
    public TacoReadDto updateTaco(@PathVariable("id") Long id, @RequestBody TacoUpdateDto tacoUpdateDto){
        return tacoService.updateTaco(id, tacoUpdateDto);
    }

    @DeleteMapping("/{id}")
    public void deleteTacoById(@PathVariable("id") Long id){
        tacoService.deleteTacoById(id);
    }
}
