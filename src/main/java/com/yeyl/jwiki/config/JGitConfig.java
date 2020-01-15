package com.yeyl.jwiki.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JGitConfig {

    @Value("${github.url}")
    public static String GithubUrl;
    @Value("${github.username}")
    public static String GithubUsername;
    @Value("${github.password}")
    public static String GithubPassword;
}
