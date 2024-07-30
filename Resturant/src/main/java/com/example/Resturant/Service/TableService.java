package com.example.Resturant.Service;


import com.example.Resturant.Entity.Table;
import com.example.Resturant.Repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TableService {

    @Autowired
    private TableRepository tableRepository;

    public List<Table> getAllTables() {
        return tableRepository.findAll();
    }

    public Optional<Table> getTableById(String id) {
        return tableRepository.findById(id);
    }

    public Table addTable(Table table) {
        return tableRepository.save(table);
    }

    public void deleteTable(String id) {
        tableRepository.deleteById(id);
    }
}
