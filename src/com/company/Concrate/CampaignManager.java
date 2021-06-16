package com.company.Concrate;

import com.company.Abstract.BaseCampaignManager;
import com.company.Adaptors.SellerServiceAdapters;
import com.company.Entities.Customer;
import com.company.Entities.Games;

public class CampaignManager extends BaseCampaignManager {
    SellerServiceAdapters sellerServiceAdapters;

    public CampaignManager(SellerServiceAdapters sellerServiceAdapters) {
        this.sellerServiceAdapters = sellerServiceAdapters;
    }

    @Override
    public void campaignAdd(Games games, Customer customer) {
        super.campaignAdd(games, customer);
    }

    @Override
    public void campaignUpdate(Games games, Customer customer) {
        games.setPrice((int)this.sellerServiceAdapters.discountedPrice(games));
        super.campaignUpdate(games, customer);

    }

    @Override
    public void campaignDelete(Games games, Customer customer) {
        super.campaignDelete(games, customer);
    }
}
