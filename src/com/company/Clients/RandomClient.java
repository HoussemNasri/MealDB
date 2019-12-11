package com.company.Clients;

import com.company.Utils.Constants;

public class RandomClient extends Client {
    @Override
    String getBaseUrl() {
        return Constants.RANDOM_SERVICE_BASE_URL;
    }

    public static String getStaticBaseUrl () {
        return new RandomClient().getBaseUrl();
    }
}
