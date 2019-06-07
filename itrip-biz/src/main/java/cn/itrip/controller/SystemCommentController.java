package cn.itrip.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 评论控制层
 * @author hellojsh
 * @create 2019-06-07 19:05
 */
@Api(value = "API", basePath = "/http://api.itrip.com/api/")
@RequestMapping("/api/comment")
@Controller
public class SystemCommentController {
}
