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

        // 최대 할인율 찾기
        Coupon target;
        for (Coupon coupon : target) {
            if (target == null || coupon.getDiscount() > target.getDiscount()) {
                target = coupon;
            }
        }

        // 적용 가능한 쿠폰이 있다면 적용한다.
        int price = product.getPrice();
        if (target != null) {
            int discountAmount = price * target.getDiscount();
            price -= discountAmount;
        }

        // 사용자 마일리지 반영
        price -= user.getMileage();

        return price;
    }
}
