package me.hexye.eliteauctionsapi.events;

import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class AuctionBID {
    private final ItemStack item;
    private final UUID sellerID;
    private final Integer bidAmount;
    private final UUID bidderID;

    public AuctionBID(ItemStack item, UUID sellerID, Integer bidAmount, UUID bidderID) {
        this.item = item;
        this.sellerID = sellerID;
        this.bidAmount = bidAmount;
        this.bidderID = bidderID;
    }

    public ItemStack getItem() {
        return item;
    }

    public UUID getSellerID() {
        return sellerID;
    }

    public Integer getBidAmount() {
        return bidAmount;
    }

    public UUID getBidderID() {
        return bidderID;
    }
}
