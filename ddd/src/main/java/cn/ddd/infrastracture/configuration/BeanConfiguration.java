package cn.ddd.infrastracture.configuration;

import cn.ddd.DomainLayerApplication;
import cn.ddd.domain.repository.OrderRepository;
import cn.ddd.domain.service.DomainOrderService;
import cn.ddd.domain.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = DomainLayerApplication.class)
public class BeanConfiguration {

    @Bean
    OrderService orderService(final OrderRepository orderRepository) {
        return new DomainOrderService(orderRepository);
    }
}
