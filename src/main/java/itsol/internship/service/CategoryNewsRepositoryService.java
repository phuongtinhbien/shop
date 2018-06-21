package itsol.internship.service;

import itsol.internship.model.CategoryNews;
import itsol.internship.repository.CategoryNewsRepository;
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
