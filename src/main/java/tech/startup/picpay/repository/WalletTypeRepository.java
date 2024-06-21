package tech.startup.picpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.startup.picpay.entity.WalletType;

public interface WalletTypeRepository extends JpaRepository<WalletType,Long> {
}
