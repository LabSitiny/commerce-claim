package dev.labsitiny.commerceclaim.port.persistence

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClaimMasterJpaRepository : JpaRepository<ClaimMasterJpaEntity, Long> {
}