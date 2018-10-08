package com.dute.officialNetwork.service.interfaces;

import com.dute.officialNetwork.api.response.decoration.DecorationClassMainTypeResponse;
import java.util.List;

public interface DecorationClassMainTypeService {
    List<DecorationClassMainTypeResponse> findAll();
}
