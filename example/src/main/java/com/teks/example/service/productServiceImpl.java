package com.teks.example.service;

import com.teks.example.entities.product;
import com.teks.example.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class productServiceImpl implements productService{

    @Autowired
    productRepository repo;

    public boolean saveProduct(product products){
        boolean status = false;

        try{
            repo.save(products);
            status = true;
        }
        catch(Exception e){
            e.printStackTrace();
            status = false;

        }
        return status;
    }

    public List<product> getProducts(){
        return repo.findAll();
    }

    public product getProductById(int Id){
        Optional<product> optional = repo.findById(Id);

        if(optional.isPresent()){
            return optional.get();
        }
        else {
            return null;
        }

    }

    @Override
    public boolean updateDetails(int Id, String name, int price, int stock, String category) {
        boolean status = false;

        product products = getProductById(Id);

        if(products != null){
            products.setName(name);
            products.setPrice(price);
            products.setStock(stock);
            products.setCategory(category);


            repo.save(products);

            status =  true;
        }
        else{
            status =  false;
        }

        return status;
    }

    @Override
    public boolean DeleteById(int id) {
        boolean status = false;

        try{
            repo.deleteById(id);
            status = true;
        }
        catch(Exception e){
            e.printStackTrace();
            status = false;
        }

        return status;
    }


}
