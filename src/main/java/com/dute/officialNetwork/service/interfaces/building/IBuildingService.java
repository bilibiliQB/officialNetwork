package com.dute.officialNetwork.service.interfaces.building;

import com.dute.officialNetwork.api.request.building.BuildingPageRequest;
import com.dute.officialNetwork.api.response.building.BuildingDataResponse;

public interface IBuildingService {
    BuildingDataResponse getBuildingData(BuildingPageRequest buildingPageRequest);
}
