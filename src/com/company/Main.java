package com.company;

import com.company.Abstract.BaseCampaignManager;
import com.company.Abstract.BaseCustomerManager;
import com.company.Abstract.BaseSellerManager;
import com.company.Adaptors.EDevletServiceAdaptor;
import com.company.Adaptors.SellerServiceAdapters;
import com.company.Concrate.CampaignManager;
import com.company.Concrate.GamerCustomerManager;
import com.company.Concrate.SellerCustomerManager;
import com.company.Entities.Gamer;
import com.company.Entities.Games;
import com.company.Entities.Seller;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager baseCustomerManager=new GamerCustomerManager(new EDevletServiceAdaptor());
        BaseCampaignManager baseCampaignManager=new CampaignManager(new SellerServiceAdapters());
        BaseSellerManager baseSellerManager=new SellerCustomerManager(new SellerServiceAdapters());
        Gamer gamer=new Gamer("12345","@gmail.com","Ayşe","Akagunduz", LocalDate.of(2014,7,14),"1404032","Balım");
        Seller seller= new Seller("54321","k@gmail.com","Beyza","Okçu",LocalDate.of(2010,12,1),"1234567890","102");
        Games games1= new Games("Smart Villa",300,10);
        baseCustomerManager.add(gamer);
        baseCustomerManager.update(gamer);
        baseCustomerManager.delete(gamer);
        baseSellerManager.sell(games1,gamer);
        baseCampaignManager.campaignAdd(games1,seller);
        baseCampaignManager.campaignUpdate(games1,seller);
        baseCampaignManager.campaignDelete(games1,seller);





    }
}
