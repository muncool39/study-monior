package com.monitor.sample;

import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
public class SampleController {

    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    /*
    해당 URL 들어오면 권한 없다는 오류 반환하도록 설정 + 로그 남겨지도록 설정
     */
    @GetMapping("/")
    public String hello(HttpServletResponse response) throws IOException {
        logger.info("Attempted access to / endpoint resulted in 403 Forbidden");
        response.sendError(HttpServletResponse.SC_FORBIDDEN, "Access Denied");
        return null;
    }
}
