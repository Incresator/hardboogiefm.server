package com.hardboogiefm.server.service;

import com.hardboogiefm.server.entity.Plates;

import java.util.List;

public interface PlatesService {
    List<Plates> getAll();
    Plates getByID(Integer id);
}
