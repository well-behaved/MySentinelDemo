package com.xue.sentinel;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @SentinelResource(value = "sayHello"
            , blockHandler = "sayHelloBlockHandler"
            , fallback = "sayHelloFallback")
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    public String sayHelloBlockHandler(String name, BlockException blockException) {
        return "限流降级方法";
    }

    public String sayHelloFallback() {
        return "熔断降级方法";
    }
}