package me.hexye.eliteauctionsapi.events;

import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class AuctionCreated {
    private final ItemStack item;
    private final UUID sellerID;
    private final Integer basePrice;
    private final Integer binPrice;
    private final boolean isAuction;

    public AuctionCreated(ItemStack item, UUID sellerID, Integer basePrice, Integer binPrice, boolean isAuction) {
        this.item = item;
        this.sellerID = sellerID;
        this.basePrice = basePrice;
        this.binPrice = binPrice;
        this.isAuction = isAuction;
    }

    public ItemStack getItem() {
        return item;
    }

    public UUID getSellerID() {
        return sellerID;
    }

    public Integer getBasePrice() {
        return basePrice;
    }

    public Integer getBinPrice() {
        return binPrice;
    }

    public boolean isAuction() {
        return isAuction;
    }
}
