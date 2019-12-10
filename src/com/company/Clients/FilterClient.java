package com.company.Clients;

import com.company.Utils.Constants;

public class FilterClient extends Client {
    @Override
    String getBaseUrl() {
        return Constants.FILTER_SERVICE_BASE_URL;
    }
}
