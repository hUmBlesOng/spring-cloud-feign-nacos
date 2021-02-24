package com.hs.consum.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 🦑bys
 * @date 2021/2/23 18:18
 */
@FeignClient("produce")
public interface ProduceFeign {

    @RequestMapping("send")
    String send();
}