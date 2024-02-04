package com.ruan.spring.domain.product;

import lombok.NonNull;

public record RequestProduct(
        long id,
        @NonNull
        String name,
        @NonNull
        Integer price_in_cents) {

}
