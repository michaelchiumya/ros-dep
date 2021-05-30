package io.rosapp.rosapplication.services;

import io.rosapp.rosapplication.entities.Sales;
import io.rosapp.rosapplication.repositories.SaleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SaleService {


    final SaleRepository saleRepository;

    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public void update(Sales sale, long id) {

        Optional<Sales> itemBox =  saleRepository.findById(id);
        if (itemBox.isPresent()) {
            Sales sale1 = itemBox.get();
            sale1.setDate(sale.getDate());
            saleRepository.save(sale1);
        }
    }

    public Sales add(Sales sale) {
        saleRepository.save(sale);
        return sale;
    }

    public Sales get(long id) {
        return saleRepository.findById(id).get();
    }

    public Iterable<Sales> getAll() {
        return saleRepository.findAll();
    }

    public Sales remove(long id){
        Sales sale = saleRepository.findById(id).get();
        saleRepository.deleteById(sale.getId());
        return sale;
    }
}
