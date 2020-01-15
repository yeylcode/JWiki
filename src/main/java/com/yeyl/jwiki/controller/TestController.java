package com.yeyl.jwiki.controller;

import com.alibaba.fastjson.JSONObject;
import com.yeyl.jwiki.config.JGitConfig;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * test
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/testJGit")
    public JSONObject testJGit(@RequestBody JSONObject params) throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg", JGitConfig.GithubUrl);
        return jsonObject;
    }
}
