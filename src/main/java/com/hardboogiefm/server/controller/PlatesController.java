package com.hardboogiefm.server.controller;


import com.hardboogiefm.server.entity.Plates;
import com.hardboogiefm.server.repository.PlatesRepository;
import com.hardboogiefm.server.service.PlatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plates")

public class PlatesController {

    @Autowired
    private PlatesService servise;

    @RequestMapping(value = "/plates", method = RequestMethod.GET)
    @ResponseBody
    public List<Plates> getAllPlates(){
        return  servise.getAll();
    }

    @RequestMapping(value = "/plates/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Plates getAllPlates(@PathVariable("id") Integer PlatesID){
        return  servise.getByID(PlatesID);
    }

}
