package tech.startup.picpay.controller.dto;

import tech.startup.picpay.entity.Wallet;
import tech.startup.picpay.entity.WalletType;

public record CreateWalletDto(String fullName,
                              String cpfCnpj,
                              String email,
                              String password,
                              WalletType.Enum walletType
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
