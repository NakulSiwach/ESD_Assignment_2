package com.nakulsiwach.esd_2.mapper;

import com.nakulsiwach.esd_2.dto.ProductReq;
import com.nakulsiwach.esd_2.entity.product;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {
    public product toproduct(ProductReq request) {
        return product.builder()
                .price(request.price())
                .name(request.name())
                .build();

    }
}
