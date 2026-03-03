package io.springpragmaticpractices.chapter.seven;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final UserJpaRepostiroy userJpaRepostiroy;
    private final ProductJpaRepository productJpaRepository;
    private final CouponJpaRepository couponJpaRepository;

    public int calculatePrice(long userId, long productId) {
        User user = userJpaRepostiroy.getById(userId);
        Product product = productJpaRepository.getById(productId);
        List<Coupon> coupons = couponJpaRepository.getByUserId(userId);

        Cashier cashier = new Cashier();
        return cashier.calculate(user, product, coupons);
    }
}
