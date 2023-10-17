package tech.digiwise.tahadi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.digiwise.tahadi.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
