package com.kodilla.ecommercee.controller.order;

import com.kodilla.ecommercee.domain.order.OrderDto;
import com.kodilla.ecommercee.controller.order.OrderNotFoundException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/v1/order")
public class OrderController {

    @RequestMapping(method = RequestMethod.GET, value = "getOrderList")
    public List<OrderDto> getOrdersList() {
        List<OrderDto> testOrderList = new ArrayList<>();
        testOrderList.add(new OrderDto(1L, "test adress", false, new Date(), 1L, 1L, new BigDecimal(321)));
        return testOrderList;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getOrder")
    public OrderDto getOrder(@RequestParam Long orderId) throws OrderNotFoundException {
        return new OrderDto(2L, "testAddress2", true, new Date(), 2L, 3L, new BigDecimal(2341));
    }

    @RequestMapping(method = RequestMethod.POST, value = "createNewOrder", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createNewOrder(@RequestBody OrderDto orderDto) {

    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateOrder", consumes = MediaType.APPLICATION_JSON_VALUE)
    public OrderDto updateOrder(@RequestBody OrderDto orderDto) {
        return new OrderDto(3L, "testAddress3", false, new Date(), 3L, 3L, new BigDecimal(321));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteOrder")
    public void deleteOrder(@RequestParam Long orderId) {

    }


}
