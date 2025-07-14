package com.dio.dio.clocks.Services;

import com.dio.dio.clocks.Data.ClockData;
import com.dio.dio.clocks.Domain.Clock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    @Autowired
    private ClockData data;

    public List<Clock> getAllProducts() {
        return ClockData.getClocksDatabase();
    }

    public Optional<Clock> getProductById(Long id) {
        return ClockData.getClocksDatabase().stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }
}
