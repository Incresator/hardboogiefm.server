package com.hardboogiefm.server.service;


import com.hardboogiefm.server.entity.Plates;
import com.hardboogiefm.server.repository.PlatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatesServiceImpl implements PlatesService{


    @Autowired
    private PlatesRepository repository;


    public List<Plates> getAll() {
        return repository.findAll();
    }

    public Plates getByID(Integer id) {
        return repository.findOne(id);
    }
}
