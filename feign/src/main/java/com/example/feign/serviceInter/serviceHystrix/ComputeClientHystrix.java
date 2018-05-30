package com.example.feign.serviceInter.serviceHystrix;

import com.example.feign.serviceInter.ComputeClient;
import org.springframework.stereotype.Service;

@Service
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public Integer add(Integer a, Integer b) {
        return 99999;
    }
}
