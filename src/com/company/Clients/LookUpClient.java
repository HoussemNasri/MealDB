package com.company.Clients;

import com.company.Utils.Constants;

public class LookUpClient extends Client {
    @Override
    String getBaseUrl() {
        return Constants.LOOKUP_SERVICE_BASE_URL;
    }
}
