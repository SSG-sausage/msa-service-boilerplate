package com.ssg.msaserviceboilerplate.common.client.internal;

import com.ssg.msaserviceboilerplate.common.client.internal.dto.response.InternalResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "InternalApiClient", url = "https://url.com")
public interface InternalApiClient {

    @GetMapping("/path")
    InternalResponse test();
}
