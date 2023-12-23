package com.mintyn.app;


import com.mintyn.app.entities.Role;
import com.mintyn.app.repositories.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MintynApplication {
    public static void main(String[] args) {
        SpringApplication.run(MintynApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(RoleRepository roleRepo) {
        return (args) -> {
            Role role= new Role();
            role.setName("ROLE_ADMIN");
            roleRepo.save(role);
        };
    }

}
