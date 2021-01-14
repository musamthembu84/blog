package AI.Blog.service;

import AI.Blog.model.Country;
import AI.Blog.repository.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class countryService {

    private final CountryRepo countryRepo;

    @Autowired
    public countryService(CountryRepo countryRepo) {
        this.countryRepo = countryRepo;
    }

    public void saveData(final Country country){
        country.setName("ZA");
        System.out.printf("dada");
        countryRepo.save(country);
    }
}
