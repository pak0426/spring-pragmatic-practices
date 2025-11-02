package io.springpragmaticpractices.chapter.one;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantChainService {

    private final StoreRepostiry storeRepostiry;

    public long calculateRevenue(long restaurantId) {
        List<Store> stores = storeRepostiry.findByRestaurantId(restaurantId);
        long revenue = 0;
        for (Store store : stores) {
            for (Order order : store.getOrders()) {
                for (Food food : order.getFoods()) {
                    revenue += food.getPrice();
                }
            }
        }

        return revenue;
    }

    public long calculateProfit(long restaurantId) {
        List<Store> stores = storeRepostiry.findByRestaurantId(restaurantId);
        long cost = 0;
        for (Store store : stores) {
            for (Order order : store.getOrders()) {
                long orderPrice = 0;

                for (Food food : order.getFoods()) {
                    orderPrice += food.getPrice();
                    cost += food.getOriginCost();
                }

                cost += orderPrice * order.getTransactionFeePercent();
            }
            cost += store.getRentalFee();
        }

        return calculateRevenue(restaurantId) - cost;
    }
}
