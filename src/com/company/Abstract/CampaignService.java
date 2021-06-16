package com.company.Abstract;

import com.company.Entities.Customer;
import com.company.Entities.Games;

public interface CampaignService {
    void campaignAdd(Games games, Customer customer);
    void campaignUpdate(Games games,Customer customer);
    void campaignDelete(Games games, Customer customer);
}
