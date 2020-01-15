package com.yeyl.jwiki.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JGitConfig {

    @Value("${github.username}")
    private String GithubUsername;
    @Value("${github.password}")
    private String GithubPassword;
}
