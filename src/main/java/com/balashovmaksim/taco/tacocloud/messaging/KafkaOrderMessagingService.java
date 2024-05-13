package com.balashovmaksim.taco.tacocloud.messaging;

import com.balashovmaksim.taco.tacocloud.model.TacoOrder;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaOrderMessagingService implements OrderMessagingService {
    private final KafkaTemplate<String, TacoOrder> kafkaTemplate;

    @Override
    public void sendOrder(TacoOrder tacoOrder) {
        kafkaTemplate.send("tacoshop.orders.topic", tacoOrder);
    }
}
