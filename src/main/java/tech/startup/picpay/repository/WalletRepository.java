package tech.startup.picpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.startup.picpay.entity.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
