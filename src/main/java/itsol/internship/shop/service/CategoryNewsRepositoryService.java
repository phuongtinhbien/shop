package itsol.internship.shop.service;

import itsol.internship.shop.model.CategoryNews;
import itsol.internship.shop.repository.CategoryNewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class CategoryNewsRepositoryService implements CategoryNewsRepository, CrudRepository<CategoryNews, String> {

    @Autowired
    CategoryNewsRepository categoryNews;
    public  void a(){
        findAll();
    }

}
