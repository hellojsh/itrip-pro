package cn.itrip.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hellojsh
 * @create 2019-06-07 19:35
 */
@Api
@Controller("/test")
public class TestController {

    @ApiOperation(value = "测试Swagger", produces = "application/json",
            httpMethod = "GET", notes = "测试")
    @RequestMapping("/api")
    @ResponseBody
    public Map<String, String> testApi() {
        Map<String, String> map = new HashMap<>();
        map.put("msg", "消息");
        return map;
    }

}
