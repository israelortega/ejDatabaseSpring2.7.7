/*
 * (c) UNAM, 2022
 */
package mx.unam.sa.ejDatabase.models.repository;


import mx.unam.sa.ejDatabase.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author israel1971
 */
@Repository
public interface UsuarioRepo extends JpaRepository<Usuario,Long> {
}
