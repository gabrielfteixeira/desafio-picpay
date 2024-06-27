package tech.startup.picpay.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import tech.startup.picpay.entity.Wallet;
import tech.startup.picpay.entity.WalletType;

public record CreateWalletDto(@NotBlank String fullName,
                              @NotBlank String cpfCnpj,
                              @NotBlank String email,
                              @NotBlank String password,
                              @NotNull WalletType.Enum walletType
                              ) {
    public Wallet toWallet(){
        return new Wallet(
                fullName,
                cpfCnpj,
                email,
                password,
                walletType.get()
        );
    }
}
