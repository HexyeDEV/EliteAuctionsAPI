package me.hexye.eliteauctionsapi.events;

import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class AuctionBIN {
    private final ItemStack item;
    private final UUID sellerID;
    private final Integer finalPrice;
    private final UUID buyerID;

    public AuctionBIN(ItemStack item, UUID sellerID, Integer finalPrice, UUID buyerID) {
        this.item = item;
        this.sellerID = sellerID;
        this.finalPrice = finalPrice;
        this.buyerID = buyerID;
    }

    public ItemStack getItem() {
        return item;
    }

    public UUID getSellerID() {
        return sellerID;
    }

    public Integer getFinalPrice() {
        return finalPrice;
    }

    public UUID getBuyerID() {
        return buyerID;
    }
}
