package com.hs.consum.controller;

import com.hs.consum.feign.ProduceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 🦑bys
 * @date 2021/2/23 17:51
 */
@RestController
public class ConsumController {

    @Autowired
    private ProduceFeign produceFeign;

    @GetMapping("consum")
    public String send(){
        String send = produceFeign.send();
        return "Consum" + send;
    }

}