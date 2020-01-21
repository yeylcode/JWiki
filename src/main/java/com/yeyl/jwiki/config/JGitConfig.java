package com.yeyl.jwiki.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class JGitConfig {

    @Value("${github.url}")
    public static String GithubUrl;
    @Value("${github.username}")
    public static String GithubUsername;
    @Value("${github.password}")
    public static String GithubPassword;
}
