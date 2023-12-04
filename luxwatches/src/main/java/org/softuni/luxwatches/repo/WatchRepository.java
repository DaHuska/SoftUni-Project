package org.softuni.luxwatches.repo;

import org.softuni.luxwatches.model.entity.Watch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchRepository extends JpaRepository<Watch, Long> {

}
