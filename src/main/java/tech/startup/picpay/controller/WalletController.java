package tech.startup.picpay.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.startup.picpay.controller.dto.CreateWalletDto;
import tech.startup.picpay.entity.Wallet;
import tech.startup.picpay.service.WalletService;

@RestController
public class WalletController {
    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping("/wallets")
    public ResponseEntity<Wallet> createWallet(@RequestBody @Valid CreateWalletDto dto){
        var wallet = walletService.createWallet(dto);

        return ResponseEntity.ok(wallet);
    }
}
