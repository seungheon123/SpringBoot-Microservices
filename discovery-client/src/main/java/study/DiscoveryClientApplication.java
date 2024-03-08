package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DiscoveryClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryClientApplication.class);
    }
}