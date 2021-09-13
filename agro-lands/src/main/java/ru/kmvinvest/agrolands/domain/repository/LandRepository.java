package ru.kmvinvest.agrolands.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kmvinvest.agrolands.domain.entity.Land;

@Repository
public interface LandRepository extends JpaRepository<Land, Long> {
}
