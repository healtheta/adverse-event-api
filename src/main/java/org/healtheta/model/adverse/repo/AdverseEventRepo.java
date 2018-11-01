package org.healtheta.model.adverse.repo;

import org.healtheta.model.adverse.AdverseEvent;
import org.healtheta.model.common.Identifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdverseEventRepo extends JpaRepository<AdverseEvent, Long> {
    public AdverseEvent findAdverseEventById(Long id);
    public AdverseEvent findAdverseEventByIdentifier(Identifier identifier);
}
