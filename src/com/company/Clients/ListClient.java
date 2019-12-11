package com.company.Clients;

import com.company.Utils.Constants;

public class ListClient extends Client{
    @Override
    String getBaseUrl() {
        return Constants.LIST_SERVICE_BASE_URL;
    }

    public static String getStaticBaseUrl () {
        return new ListClient().getBaseUrl();
    }
}
