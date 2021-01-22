package com.github.perscholas;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by leon on 9/15/2020.
 */
@Component
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country spain = new Country();
        Country poland = new Country();
        Country uk = new Country();

        countries.put(spain.getName(), spain);
        countries.put(poland.getName(), poland);
        countries.put(uk.getName(), uk);

        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(46704314);

        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38186860);

        uk.setName("United Kingdom");
        uk.setCapital("London");
        uk.setCurrency(Currency.GBP);
        uk.setPopulation(63705000);
    }

    public Country findCountry(String name) {
        return Objects.requireNonNull(countries.get(name));
    }
}