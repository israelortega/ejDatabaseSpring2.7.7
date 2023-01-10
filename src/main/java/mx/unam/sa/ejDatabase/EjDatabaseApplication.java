package mx.unam.sa.ejDatabase;

import mx.unam.sa.ejDatabase.models.Usuario;
import mx.unam.sa.ejDatabase.models.repository.UsuarioRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EjDatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(EjDatabaseApplication.class, args);

    }

    @Bean
    public CommandLineRunner demo(UsuarioRepo repository) {
        return (args) -> {
            repository.save(new Usuario(10L,"A","B","C"));
            repository.save(new Usuario(20L,"D","E","F"));
        };
    }
}
