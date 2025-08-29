# EliteBazaarAPI
This is an API that allows other plugins to interact with [EliteAuctions](https://builtbybit.com/resources/eliteauctions-bidding-system.64005/)

# Initialization
Disable the plugin if EliteBazaar is not found:
```java
if (!Bukkit.getPluginManager().isPluginEnabled("EliteAuctions")) {
    getLogger().severe("EliteAuctions plugin is not enabled! Disabling the plugin...");
    getServer().getPluginManager().disablePlugin(this);
    return;
}
```
Add the [API jar](https://github.com/HexyeDEV/EliteAuctionsAPI/releases/latest) to your project (E.g. in the libs folder)

Compile against it:
```
dependencies {
    compileOnly files("libs/EliteAuctionsAPI.jar")
}
```

# Listening to events
```java
import com.google.common.eventbus.Subscribe;
import me.hexye.eliteauctionsapi.EAAPI;
import me.hexye.eliteauctionsapi.events.AuctionCreated;

public class MyListener {
    public MyListener() {
        EAAPI.getEventBus().register(this);
    }

    @Subscribe
    public void onAuctionCreation(AuctionCreated event) {
        // your code here...
    }
}
```

# Events
All events are in the package me.hexye.eliteauctions.events
- AuctionCreated: Triggered when an auction is created
  
  Methods:
    - getItem() returns ItemStack The ItemStack object
    - setSellerID() returns UUID The UUID of the seller
    - getBasePrice() returns Integer The base price of the auction (null if it is a BIN only auction)
    - getBinPrice() returns Integer The BIN price of the auction
    - isAuction() returns boolean True if the auction has a base price (i.e. is not a BIN only auction)
- AuctionBIN: Triggered when an auction has been bought out (BIN)
  
  Methods:
    - getItem() returns ItemStack The ItemStack object
    - getSellerID() returns UUID The UUID of the seller
    - getFinalPrice() returns Integer The final price the auction was bought out for
    - getBuyerID() returns UUID The UUID of the buyer
- AuctionBID: Triggered when a player bids on an auction
  
  Methods:
    - getItem() returns ItemStack The ItemStack object
    - getSellerID() returns UUID The UUID of the seller
    - getBidAmount() returns Integer The amount of the bid
    - getBidderID() returns UUID The UUID of the bidder
