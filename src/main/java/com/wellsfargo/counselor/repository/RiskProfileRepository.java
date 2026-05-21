package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.entity.RiskProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RiskProfileRepository extends JpaRepository<RiskProfile, Long> {
    Optional<RiskProfile> findByClient_ClientId(Long clientId);
}
