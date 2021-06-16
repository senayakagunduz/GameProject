package com.company.Abstract;

import com.company.Entities.Customer;
import com.company.Entities.Games;

public abstract class BaseCampaignManager implements CampaignService{
    public BaseCampaignManager() {
        super();
    }

    @Override
    public void campaignAdd(Games games, Customer customer) {
        System.out.println(games.getGameName()+ " oyunu " +customer.getFirstName()+ " tarafından " + games.getPrice() +" TL ye satıldı");
    }

    @Override
    public void campaignUpdate(Games games, Customer customer) {
        System.out.println(games.getGameName()+ " oyunu "+ games.getPrice()+ " TL ye " + customer.getFirstName()+ " tarafından güncellendi " );
    }

    @Override
    public void campaignDelete(Games games, Customer customer) {
        System.out.println(games.getGameName()+ " oyunu silindi "+ customer.getFirstName()+ " tarafından silindi ");
    }
}
