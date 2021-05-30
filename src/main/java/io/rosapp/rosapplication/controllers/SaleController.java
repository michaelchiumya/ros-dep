package io.rosapp.rosapplication.controllers;


import io.rosapp.rosapplication.entities.Sales;
import io.rosapp.rosapplication.services.SaleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RequestMapping("/api/v1")
@RestController
public class SaleController {

    private  final SaleService saleService;

    @PostMapping(path = "/sale")
    public Sales postSales(@RequestBody Sales sale){
        return saleService.add(sale);
    }

    @GetMapping(path="/sale/{id}")
    public Sales getSale(@PathVariable long id){
        return saleService.get(id);
    }

    @GetMapping(path="/sales")
    public List<Sales> getSales(){
        List<Sales> sales = new ArrayList<>();
        saleService.getAll().forEach(sales::add);
        return sales;
    }

    @DeleteMapping(path="/sale/{id}")
    public Sales deleteSale(@PathVariable long id) {
        return saleService.remove(id);
    }

    @PutMapping(path="/sale/{id}")
    public void UpdateSale(@RequestBody Sales sale, @PathVariable long id){
        saleService.update(sale, id);
    }
}
