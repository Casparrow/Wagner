
package com.portfolio.Wagner.Repository;

import com.portfolio.Wagner.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPersonaRepository extends JpaRepository<Persona,Long>  {
    
}
